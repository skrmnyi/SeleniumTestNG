import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CreateIssuePage;
import pages.IssuesRepositoryPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RepositoryPage;

public class VerifyCreateIssueButtonIsDisabledWithoutIssueTitleTest extends ConfigTest {
  @Test
  public void verifyCreateIssueButtonIsDisabledWithoutIssueTitleTest() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.successfulLogin("skrmnyi", "*******");
    MainPage mainPage = new MainPage(driver);
    mainPage.navigateToRepositoryPage();
    RepositoryPage repositoryPage = new RepositoryPage(driver);
    repositoryPage.navigateToIssuesRepositoryPage();
    IssuesRepositoryPage issuesRepositoryPage = new IssuesRepositoryPage(driver);
    issuesRepositoryPage.navigateToCreateIssuePage();
    CreateIssuePage createIssuePage = new CreateIssuePage(driver);
    createIssuePage.fillInputBody("Test text");
    Assertions.assertFalse(createIssuePage.getSubmitNewIssueButton().isEnabled());
  }
}

