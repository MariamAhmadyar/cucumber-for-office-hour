package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage {

    //in order to use selected or not you need to add input tag so solution is change your locator
    @FindBy(xpath = "//label[.='Football']/../input")
    public WebElement radioButtonForFootball;

    @FindBy(xpath = "//label[.='Hockey']/../input")
    public WebElement radioButtonForHockey;







}
