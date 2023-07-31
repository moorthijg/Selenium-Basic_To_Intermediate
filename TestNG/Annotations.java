package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Annotations {

    public WebDriver driver;

    @BeforeTest
    public void launching(){
        driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
    @BeforeClass
    public void simply(){
        System.out.println("Start");
    }
    @AfterClass
    public void after(){
        System.out.println("After class");
    }
    @BeforeMethod
    public void methodingA(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void methodingZ(){
        System.out.println("After method");
    }
    @Test
    public void testing(){
        driver.get("http:\\www.google.com");
    }

}
