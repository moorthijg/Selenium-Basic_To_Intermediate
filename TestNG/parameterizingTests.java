package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizingTests {

    public WebDriver driver;

    @Test
    @Parameters("myName")
    public void ParameterizedTest1(String myName ){
        System.out.println(myName);

    }
}
