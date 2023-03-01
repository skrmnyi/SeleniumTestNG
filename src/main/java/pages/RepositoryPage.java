package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepositoryPage extends ConfigPage {
  public RepositoryPage(WebDriver driver) {
    super(driver);
  }

  WebElement codeTab = driver.findElement(By.xpath("//span[@data-content=\"Code\"]"));
  WebElement issuesTab =
      driver.findElement(By.xpath("//span[@data-content=\"Issues\"]/parent::a"));
  WebElement pullRequests = driver.findElement(By.xpath("//span[@data-content=\"Pull requests\"]"));

  public IssuesRepositoryPage navigateToIssuesRepositoryPage() {
    issuesTab.click();
    return new IssuesRepositoryPage(driver);
  }
}
