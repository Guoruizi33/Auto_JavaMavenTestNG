package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Register {

    WebDriver dr;


    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        dr = new ChromeDriver();
        dr.manage().window().fullscreen();
        dr.get("http://jianshu.com");
        System.out.println("----------BeforeMothedRegister -----------");
    }

    @Test
    public void loginJianShu(){
        dr.findElement(By.className("log-in")).click();
        System.out.println("---------TestCaseRegister1 ---------");
    }

    @Test
    public void openJianShu(){
        dr.findElement(By.className("log-in")).click();
        System.out.println("---------TestCaseRegister2 ---------");
    }

    @AfterMethod
    public void afterMethod(){
        dr.quit();
        System.out.println("----------AfterMethedRegister -----------");
    }

}
