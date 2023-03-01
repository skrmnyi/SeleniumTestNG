package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroPage extends ConfigPage {
  public IntroPage(WebDriver driver) {
    super(driver);
  }

  private WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
  private WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
}
