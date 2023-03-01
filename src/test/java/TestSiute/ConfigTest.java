package TestSiute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class ConfigTest {
    WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("skrmnyi", "*******");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
