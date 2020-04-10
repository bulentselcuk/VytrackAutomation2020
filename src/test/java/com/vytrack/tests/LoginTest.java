package com.vytrack.tests;

import com.vytrack.pages.LoginPages;
import org.testng.annotations.Test;

public class LoginTest extends AbstractBaseTest{
 @Test
 public void login(){
     extentTest = extentReports.createTest("Verify login page");
     LoginPages loginPages = new LoginPages ();
     loginPages.login ();
     extentTest.pass("Successfuly Login Issue");
 }
}
