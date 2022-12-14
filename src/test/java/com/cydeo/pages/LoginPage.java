package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.BrowserUtils.clickElement;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='user']")
    public WebElement txt_username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txt_password;


    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement btn_login;


    public void login(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
    }


    public void login() {
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        clickElement(btn_login);
    }
}
