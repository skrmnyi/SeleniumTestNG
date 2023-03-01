import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigTest {
  WebDriver driver;

  @BeforeEach
  public void launchBrowser() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://github.com/login");
  }

  @AfterEach
  public void closeBrowser() {
    driver.quit();
  }
}
