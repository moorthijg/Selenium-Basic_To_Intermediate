package Automating_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Total_Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();

        // navigating to the website using get method
        driver.get("https:\\www.google.com");

        //here we need to find every webelements present in the current webpage to find all the
        // elements we need to use collections List

        List<WebElement> list = driver.findElements(By.tagName("a"));
        int a = list.size();
        System.out.println(a);
        for(int i=0;i<a;i++){
            System.out.println(list.get(i).getText());
        }

    }
}