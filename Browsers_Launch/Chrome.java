package Browsers_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
    }
}
