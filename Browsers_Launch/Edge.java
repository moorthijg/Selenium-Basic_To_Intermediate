package main.Selenium.Browsers_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edge {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\edge\\msedgedriver.exe");
        System.out.println("edge browser launched");

    }
}
