package IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("html/body/a/img")).click();

        // switching to parent frame
        driver.switchTo().parentFrame();

    }
}
