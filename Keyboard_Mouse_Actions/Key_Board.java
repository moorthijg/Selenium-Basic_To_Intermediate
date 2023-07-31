package Keyboard_Mouse_Actions;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Board {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https:\\www.google.com");

        Actions action = new Actions(driver);
        WebElement a = driver.findElement(By.name("q"));
        a.sendKeys("India", Keys.ENTER);
        WebElement b = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        b.clear();
        b.sendKeys("Google", Keys.ENTER);
    }

}
