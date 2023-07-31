package Window_Handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Handle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // we need tab's value for switching the tab again and again
        String s = driver.getWindowHandle();

        System.out.println(s);

        driver.findElement(By.id("tabButton")).click();
        String t = driver.getWindowHandle();

        driver.switchTo().window(s);
        driver.findElement(By.id("tabButton")).click();

    }
}
