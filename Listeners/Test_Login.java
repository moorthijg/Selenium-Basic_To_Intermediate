package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listeners.ListenerTest;
@Listeners(ListenerTest.class)
public class Test_Login{
    WebDriver driver;
        @Test
        public void Login()
        {
             driver = new ChromeDriver();
            System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/V4/");
            driver.findElement(By.name("uid")).sendKeys("mngr34926");
            driver.findElement(By.name("password")).sendKeys("amUpenu");
            driver.findElement(By.name("btnLogin")).click();
        }
    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
