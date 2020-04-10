package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends AbstractBasePage{
    @FindBy(id = "prependedInput")
    private WebElement userName;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(id = "_submit")
    private WebElement login;


    public LoginPages(){

        PageFactory.initElements ( Driver.getDriver (),this );
    }
    public void login(String usernameValue, String passwordValue) {
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(3);
    }
    public void login(){
        BrowserUtils.wait (2 );
        String usernameValue =ConfigurationReader.getProperty ( "username" );
        String passwordValue = ConfigurationReader.getProperty ( "password" );
        userName.sendKeys ( usernameValue );
        password.sendKeys ( passwordValue);
        login.click ();
    }

    public void navigateTo(String component) {
    }
}
