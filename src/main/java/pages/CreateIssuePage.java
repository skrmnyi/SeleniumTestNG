package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateIssuePage extends ConfigPage {
  public CreateIssuePage(WebDriver driver) {
    super(driver);
  }

  private WebElement newIssueInputTitle =
      driver.findElement(By.xpath("//input[@name=\"issue[title]\"]"));
  private WebElement newIssueInputBody =
      driver.findElement(By.xpath("//textarea[@name=\"issue[body]\"]"));
  private WebElement submitNewIssueButton =
      driver.findElement(By.xpath(
          "//div[contains(@class,'flex-items-center')]/button[contains(text(),'Submit new issue')]"));

  public WebElement getSubmitNewIssueButton() {
    return submitNewIssueButton;
  }

  public CreatedIssuePage createNewIssue(String title, String description) {
    newIssueInputTitle.sendKeys(title);
    newIssueInputBody.sendKeys(description);
    submitNewIssueButton.click();
    return new CreatedIssuePage(driver);
  }

  public void fillInputBody(String description){
    newIssueInputBody.sendKeys(description);
  }
  public void fillInputTitle(String description){
    newIssueInputTitle.sendKeys(description);
  }
}






