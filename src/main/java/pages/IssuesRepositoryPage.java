package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesRepositoryPage extends ConfigPage {
  // we have 2 Issues pages: 1 is Global for all repositories
  // and 2nd is related to specific *Repository*
  public IssuesRepositoryPage(WebDriver driver) {
    super(driver);
  }

  private WebElement newIssueButton = driver.findElement(By.xpath("//span[text()=\"New issue\"]"));
  private WebElement noIssuesMessage =
      driver.findElement(By.xpath("//h3[text()='There aren’t any open issues.']"));

  public WebElement getNoIssuesMessage() {
    return noIssuesMessage;
  }

  public CreateIssuePage navigateToCreateIssuePage() {
    newIssueButton.click();
    return new CreateIssuePage(driver);
  }
}
