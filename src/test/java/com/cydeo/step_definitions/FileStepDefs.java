package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.FilesPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FileStepDefs {


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env_try"));
        new LoginPage().login();
    }

    @When("user clicks {string} module")
    public void user_clicks_module(String moduleName) {
    new DashboardPage().clickModulesWithText(moduleName);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user click the top left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        BrowserUtils.sleep(2);
        new FilesPage().checkAllFilesButton.click();
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        BrowserUtils.sleep(2);
        // new FilesPage().assertCheckButtonsisChecked();
        Assert.assertTrue(BrowserUtils.isAllSelected(new FilesPage().checkFileButtons));
    }

}
