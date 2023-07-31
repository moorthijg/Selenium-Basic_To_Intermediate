package Waits_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluent_Wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https:\\www.ajio.com");
        WebElement a = driver.findElement(By.xpath("//*[@id=\"rotatedImageComponent\"]/div/div[1]/div/div/div[2]/div/div/a[2]"));
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .ignoring(Exception.class)
                .pollingEvery(Duration.ofSeconds(5))
                .withTimeout(Duration.ofSeconds(30));
        a.click();
        String s = driver.getTitle();
        System.out.println(s);
    }
}
