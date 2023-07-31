package Keyboard_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mouse_Hover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.get("https://demoqa.com/menu/");
        WebElement a = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        action.moveToElement(a).perform();
        WebElement b = driver.findElement(By.xpath("(//a[normalize-space()='SUB SUB LIST »'])[1]"));
        action.moveToElement(b).perform();
        System.out.println(b.getText());




    }
}
