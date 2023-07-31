package Keyboard_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https:\\www.google.com");
        WebElement a = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);

        // here we Perform the Right-click action on search bar of Google

        action.contextClick(a).perform();

    }
}
