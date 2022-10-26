package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.RadioButtonPage;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static com.cydeo.utilities.BrowserUtils.sleep;

public class RadioButtonStepDefs {


   RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Given("the user go to the web page")
    public void the_user_go_to_the_web_page() {
        sleep(3);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user click the Radio Buttons")
    public void the_user_click_the_radio_buttons() {
        sleep(2);
        HomePage.click("Radio Buttons");
    }

    @When("the user clicks the Hockey")
    public void the_user_clicks_the_hockey() {
        sleep(2);
   radioButtonPage.radioButtonForHockey.click();

    }

    @Then("the user verify the hockey is checked")
    public void the_user_verify_the_hockey_is_checked() {
        sleep(3);
        Assert.assertTrue(radioButtonPage.radioButtonForHockey.isSelected());
    }

}
