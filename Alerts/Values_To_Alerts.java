package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Values_To_Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("prompt")).click();
       Alert alert = driver.switchTo().alert();
       String s = driver.switchTo().alert().getText();
       System.out.println(s);
       alert.sendKeys("murali");
       Thread.sleep(5000);
       alert.accept();
    }
}
