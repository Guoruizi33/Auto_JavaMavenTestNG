package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By userNameInput = By.id("session_email_or_mobile_number");
    By passwordInput = By.id("session_password");

    public void inputUsernamePwd(String userName, String password){
        writeText(userNameInput,userName);
        writeText(passwordInput,password);
    }
}
