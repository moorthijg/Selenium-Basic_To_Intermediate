package Keyboard_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        Actions action = new Actions(driver);
        WebElement a = driver.findElement(By.id("draggable"));
        WebElement b = driver.findElement(By.id("droppable"));
        action.dragAndDrop(a,b).perform();
        String text = b.getText();
        System.out.println(text);
        if(text.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        }else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }

    }
}
