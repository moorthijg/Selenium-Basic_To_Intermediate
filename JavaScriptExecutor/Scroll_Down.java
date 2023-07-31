package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.manage().window().maximize();

        driver.get("http://ajio.com/");
//        driver.findElement(By.name("q")).sendKeys("India", Keys.ENTER);

        //Scrolling down the window
        js.executeScript("window.scrollBy(0,1200)");

    }
}
