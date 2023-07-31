package Waits_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explict_Wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https:\\www.ajio.com");
        WebElement a = driver.findElement(By.xpath("//div[@class='banner-components-runtime']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[4]//div[1]//div[1]//a[2]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(a)));
        a.click();
        String s = driver.getCurrentUrl();
        System.out.println(s);
    }
}
