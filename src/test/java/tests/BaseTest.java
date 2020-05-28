package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    String baseURL = "http://jianshu.com";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterClass
    public void quiteBrowser(){
        driver.quit();
    }
}
