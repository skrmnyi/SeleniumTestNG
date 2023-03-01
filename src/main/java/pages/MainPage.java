package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends ConfigPage {
  public MainPage(WebDriver driver) {
    super(driver);
  }

  private WebElement issuesTab = driver.findElement(By.xpath("//a[contains(text(),'Issues')]"));
  private WebElement codeSpacesTab =
      driver.findElement(By.xpath("//a[contains(text(),'Codespaces')]"));
  private WebElement marketPlaceTab =
      driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]"));
  private WebElement repoTest =
      driver.findElement(
          By.xpath("//div[@class='wb-break-word']/a[contains(@href,'Selenium_JUnit')]" +
              "[contains(@data-hydro-click,'location=left')]"));

  public WebElement getIssuesTab() {
    return issuesTab;
  }

  public WebElement getCodeSpacesTab() {
    return codeSpacesTab;
  }

  public WebElement getMarketPlaceTab() {
    return marketPlaceTab;
  }

  public WebElement getRepoTest() {
    return repoTest;
  }

  public RepositoryPage navigateToRepositoryPage() {
    repoTest.click();
    return new RepositoryPage(driver);
  }

  public IssuesGlobalPage navigateToIssuesGlobalPage() {
    issuesTab.click();
    return new IssuesGlobalPage(driver);
  }
}

