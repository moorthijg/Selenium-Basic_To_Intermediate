package JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor{

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demo.guru99.com/V4/");
        WebElement button =driver.findElement(By.name("btnLogin"));
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        js.executeScript("arguments[0].click();", button);
    }
}
