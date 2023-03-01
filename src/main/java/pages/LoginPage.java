package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ConfigPage {
  public LoginPage(WebDriver driver) {
    super(driver);
  }
  private WebElement loginField = driver.findElement(By.id("login_field"));
  private WebElement passwordField = driver.findElement(By.id("password"));
  private WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));

  public MainPage successfulLogin(String username, String password) {
    loginField.sendKeys(username);
    passwordField.sendKeys(password);
    signInButton.click();
    return new MainPage(driver);
  }
}
