package Automating_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Box {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();

        // navigating to the website using get method
        driver.get("https://demo.guru99.com/test/login.html");

        //finding the webelements present in the current web page
        driver.findElement(By.id("email")).sendKeys("moorthij@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Tn20as6314@");
        driver.findElement(By.name("SubmitLogin")).click();

    }
}
