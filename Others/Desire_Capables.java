import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Desire_Capables {
    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "77.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
    }
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https:\\www.google.com");
        driver.quit();
    }
}
