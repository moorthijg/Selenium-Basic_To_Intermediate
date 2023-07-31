package POM;

import org.openqa.selenium.WebDriver;

public class My_Account {
    WebDriver driver;

    public    My_Account(WebDriver driver)    {
        this.driver = driver;
    }
    public String getHeading(){
        String head = driver.getTitle();
        System.out.println(head);
        return head;
    }

}
