package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
    public WebDriver driver;

    @Test
    public void testing() {
        driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement a = driver.findElement(By.name("username"));
        a.sendKeys("student");
        WebElement b = driver.findElement(By.name("password"));
        b.sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(actualUrl, expectedUrl);
        driver.close();
    }
}