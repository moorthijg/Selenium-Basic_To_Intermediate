package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    WebDriver driver;
    By username = By.id("CustomerEmail");
    By password = By.id("CustomerPassword");
    By submitButton = By.xpath("//button[normalize-space()='Login']");
    public Login_Page(WebDriver driver){
        this.driver=driver;
    }
    public Login_Page usernameAs(String email)    {
        driver.findElement(username).sendKeys(email);
        return    this;
    }
    public Login_Page passwordAs(String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }
    public void submit(){
        driver.findElement(submitButton).click();
    }
}
