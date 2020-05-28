package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.cssSelector(".btn.log-in");

    public void clickLogin(){
        click(loginButton);
    }
}
