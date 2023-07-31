package main.Selenium.Browsers_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        System.getProperty("web-driver.gecko.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\gecko.exe");
        System.out.println("fire browser launched");

    }
}
