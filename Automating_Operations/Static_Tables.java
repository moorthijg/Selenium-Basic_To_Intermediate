package Automating_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        WebElement a = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[6]/td[3]/span"));
        System.out.println(a.getText());
    }
}
