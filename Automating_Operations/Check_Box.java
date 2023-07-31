package Automating_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement a = driver.findElement(By.xpath("//input[@value='Performance']"));
        if(a.isEnabled() && a.isDisplayed()){
            a.click();
            System.out.println("performance testing selected");

        }
    }
}
