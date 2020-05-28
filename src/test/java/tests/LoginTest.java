package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExtentReports.ExtentTestManager;

import java.lang.reflect.Method;

public class LoginTest extends BaseTest{

    @Test(priority = 0,description = "Use Invalid Password to login")
    public void InvalidPasswordLogin(Method method){
        ExtentTestManager.startTest(method.getName(), "Use Invalid Password to login");
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickLogin();
        loginPage.inputUsernamePwd("123456789","12345");
    }
}
