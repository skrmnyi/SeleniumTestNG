package TestSiute;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateIssuePage;
import pages.IssuesRepositoryPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RepositoryPage;

public class VerifyCreateIssueButtonIsDisabledWithoutIssueTitleTest extends ConfigTest {
  @Test (priority = 2)
  public void verifyCreateIssueButtonIsDisabledWithoutIssueTitleTest() {
    MainPage mainPage = new MainPage(driver);
    mainPage.navigateToSpecificRepo("SeleniumCucumber");
    RepositoryPage repositoryPage = new RepositoryPage(driver);
    repositoryPage.navigateToIssuesRepositoryPage();
    IssuesRepositoryPage issuesRepositoryPage = new IssuesRepositoryPage(driver);
    issuesRepositoryPage.navigateToCreateIssuePage();
    CreateIssuePage createIssuePage = new CreateIssuePage(driver);
    createIssuePage.fillInputBody("Test text");
    Assert.assertFalse(createIssuePage.getSubmitNewIssueButton().isEnabled());
  }
}

