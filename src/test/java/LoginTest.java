import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends ConfigTest {

  @Test
  public void successfulLogin() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.successfulLogin("skrmnyi", "*******");
    MainPage mainPage = new MainPage(driver);
    Assertions.assertTrue(mainPage.getRepoTest().isDisplayed());
    Assertions.assertTrue(mainPage.getIssuesTab().isDisplayed());
    Assertions.assertTrue(mainPage.getCodeSpacesTab().isDisplayed());
    Assertions.assertTrue(mainPage.getMarketPlaceTab().isDisplayed());
  }
}
