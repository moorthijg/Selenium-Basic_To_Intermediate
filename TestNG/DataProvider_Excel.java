package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvider_Excel {
    public WebDriver driver;

    @DataProvider(name = "Authentication")
    public  Object[] [] testing(){

        return new Object[][] { { "tester_1", "Test@123" }, { "tester_1", "Test@123" }};
    }

    @Test(dataProvider="Authentication")
    public void entering(String username , String password){
        driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        driver.get("https://www.themancompany.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("CustomerEmail")).sendKeys(username);
        driver.findElement(By.name("customer[password]")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
}
