package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatedIssuePage extends ConfigPage {
  public CreatedIssuePage(WebDriver driver) {
    super(driver);
  }

  public WebElement getOpenStatusLabel() {
    return openStatusLabel;
  }

  WebElement openStatusLabel = driver.findElement(
      By.xpath("//div[contains(@class, 'self-center')]/span[@title=\"Status: Open\"]"));
}
