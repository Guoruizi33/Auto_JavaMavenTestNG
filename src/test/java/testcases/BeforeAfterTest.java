package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAfterTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("------------BeforeSuite------------");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("------------AfterSuite------------");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("------------BeforeTest------------");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("------------AfterTest------------");
    }
}