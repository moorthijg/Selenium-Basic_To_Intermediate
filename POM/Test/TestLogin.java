package POM.Test;

import POM.Home_Page;
import POM.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;

    @BeforeTest
    public void settingUp() {
        driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testing(){
        driver.get("https://www.themancompany.com/");
        new Home_Page(driver).login();
        new Login_Page(driver).usernameAs("moorthijg@gmail.com").passwordAs("4e63bb7e1e0fb1b").submit();

    }






}
