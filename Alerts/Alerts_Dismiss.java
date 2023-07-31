package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Dismiss {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("12345");
        driver.findElement(By.name("submit")).submit();

        Alert alert = driver.switchTo().alert();
        String s = driver.switchTo().alert().getText();
        System.out.println(s);
        alert.dismiss();
        // if we dismiss the alert means the below input values will be added to the previous input
        driver.findElement(By.name("cusid")).sendKeys("78965");




    }
}
