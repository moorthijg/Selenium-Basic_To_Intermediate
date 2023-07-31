package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiple_Tests {

    public WebDriver driver;

    @BeforeTest
    public void launching(){
        driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("Chrome browser launched");
    }
    @AfterTest
    public void closing(){
        driver.close();
    }

    @Test(description = "opening google website" , priority = 0,enabled = true)
    public void navigating(){
        driver.get("https:\\www.google.com");
        String s = driver.getTitle();
        System.out.println(s);
    }

    @Test(dependsOnMethods = "navigating")
    public void searching(){
        driver.findElement(By.name("q")).sendKeys("Tourism Norway", Keys.ENTER);
        String t = driver.getCurrentUrl();
        System.out.println(t);
    }

}














