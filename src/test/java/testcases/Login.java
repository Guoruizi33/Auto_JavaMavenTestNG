package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Login {
    WebDriver dr;

    @BeforeClass
    public void beforeClass(){
        System.out.println("------------BeforeClassLogin------------");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("------------AfterClassLogin------------");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        dr = new ChromeDriver();
        dr.manage().window().fullscreen();
        dr.get("http://baidu.com");
        System.out.println("----------BeforeMothedLogin -----------");
    }

    @Test
    public void baiduHomePage(){
        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        System.out.println("---------TestCaseLogin1 ---------");
    }

    @Test
    public void baiduHomePage2(){
        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("java");
        dr.findElement(By.id("su")).click();
        System.out.println("---------TestCaseLogin2 ---------");
    }

    @AfterMethod
    public void afterMethod(){
        dr.quit();
        System.out.println("----------AfterMethedLogin -----------");
    }
}
