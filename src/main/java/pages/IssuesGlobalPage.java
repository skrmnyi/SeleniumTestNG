package pages;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesGlobalPage extends ConfigPage {
  public IssuesGlobalPage(WebDriver driver) {
    super(driver);
  }

  // we have 2 Issues pages: 1 is *Global* for all repositories
  // and 2nd is related to specific repository
  private List<WebElement> issuesTypes =
      driver.findElements(By.xpath("//nav[@aria-label='Issues']//a"));

  public List<String> getIssueTypes() {
    List<String> issueTypes =
        issuesTypes.stream().map(eachType -> eachType.getText()).collect(Collectors.toList());
    return issueTypes;
  }
}
