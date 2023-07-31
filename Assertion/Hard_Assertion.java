package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hard_Assertion {
    public WebDriver driver;

    @BeforeTest
    public void testing1() {
        driver = new ChromeDriver();
        System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
        System.out.println("chrome browser launched");
    }
        @Test
        public void testing2 () {
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.name("password")).sendKeys("Password123");
            driver.findElement(By.cssSelector("button#submit")).click();

            // This below code is passed case
            String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
            String actualUrl = driver.getCurrentUrl();
            System.out.println(actualUrl);
            Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");

            // but this code is doesn't meet the exact value of the output so the entire script is called by failed
            WebElement successMessage = driver.findElement(By.tagName("strong"));
            String expectedMessage = "Congratulations moorthi. You successfully logged in!";
            String actualMessage = successMessage.getText();
            System.out.println(actualMessage);
            Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\nActual Message: " + actualMessage + "\nExpected Message: " + expectedMessage);
        }
    }

    //but for soft assertion if it is even the expected values doesn't meet means the test script is passed.

