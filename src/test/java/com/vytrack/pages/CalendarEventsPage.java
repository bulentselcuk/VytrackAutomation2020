package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class CalendarEventsPage extends AbstractBasePage {

    @FindBy(css="#main-menu > ul > li:nth-child(5) > a > span")
    private WebElement Activities;
    @FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span")
    private WebElement CalendarEvent;

    @FindBy(xpath="//*[@id=\"grid-calendar-event-grid-344148501\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")
    private WebElement DropDownOpen;

    @FindBy(xpath="//*[@id=\"grid-calendar-event-grid-344148501\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[9]/div/div/ul/li/ul/li[1]/a")
    private WebElement View;

    private Actions actions;

    public void CalendarEventsPage() {

        PageFactory.initElements ( Driver.getDriver (), this );
    }

    public void CalendarEvents() {

        actions=new Actions ( driver );
        actions.moveToElement ( Activities ).perform ();
        BrowserUtils.wait ( 2 );
        CalendarEvent.click ();
        BrowserUtils.wait ( 1 );
        actions.moveToElement ( DropDownOpen ).click().perform ();
        BrowserUtils.wait ( 2 );
        View.click ();

    }
}
