package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
public WebDriver driver;

    By login_btn =  By.xpath("//div[@class='icon d-none-xs']//a//*[name()='svg']");
    public Home_Page(WebDriver driver){
        this.driver=driver;
    }
    public void login(){
        driver.findElement(login_btn).click();
    }
}
