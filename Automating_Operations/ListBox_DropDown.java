package Automating_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_DropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();

        // navigating to the website using get method
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

        // to select values from the dropdown lists we need to use Select class for implementing
        //actions in dropdown menu
        //finding the webelement where we need to perform Actions
        Select s = new Select(driver.findElement(By.xpath("//select[@id='first']")));
        s.selectByIndex(2);
        // and it also has other methods like
        s.selectByVisibleText("Google");
        s.selectByValue("Yahoo");

    }
}
