package Window_Handles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_New_Window {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();

        // used to open new tab in the current  browser instance
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/browser-windows");

        // used to open new browser instance window
        driver.switchTo().newWindow(WindowType.WINDOW);

    }
}
