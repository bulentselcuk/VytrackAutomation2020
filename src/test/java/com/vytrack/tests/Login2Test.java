package com.vytrack.tests;

import com.vytrack.pages.LoginPages;
import com.vytrack.utilities.ExcelUtil;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login2Test extends AbstractBase2Test{
    @Test(dataProvider = "credentialsFromExcel")
    public void loginTestWithExcel(String execute, String username, String password, String firstname, String lastname, String result) {
        test = report.createTest("Login test for username :: " + username);
        if (execute.equals("y")) {
            LoginPages loginPage = new LoginPages();
            loginPage.login(username, password);
            test.info("Login as " + username);//log some steps
            test.info(String.format("First name: %s, Last name: %s, Username: %s", firstname, lastname, username));
            test.pass("Successfully logged in as " + username);
        } else {
            test.skip("Test was skipped for user: " + username);
            //to skip some test in testng
            throw new SkipException ("Test was skipped for user: " + username);
        }
    }

    @DataProvider
    public Object[][] credentialsFromExcel() {
        String path = "VytrackTestUsers.xlsx";
        String spreadSheet = "QA3-short";
        ExcelUtil excelUtil = new ExcelUtil(path, spreadSheet);
        //execute	username	password	firstname	lastname	result
        return excelUtil.getDataArray();
    }
}
