package com.vytrack.tests;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.pages.LoginPages;
import com.vytrack.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class CalendarEventsTest extends AbstractBaseTest{

    @Test
    public void EventTest(){
//       extentTest = extentReports.createTest("Verify login page");
        LoginPages loginPages = new LoginPages ();
        loginPages.login ();
        BrowserUtils.wait ( 4 );
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage ();
        calendarEventsPage.CalendarEvents();


//        extentTest.pass("Successfuly Login Issue");
    }
}
