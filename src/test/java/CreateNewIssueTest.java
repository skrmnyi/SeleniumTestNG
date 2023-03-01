
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateIssuePage;
import pages.CreatedIssuePage;
import pages.IssuesRepositoryPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RepositoryPage;

public class CreateNewIssueTest extends ConfigTest {
  @Test
  public void createNewIssueTest() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.successfulLogin("skrmnyi", "*******");
    MainPage mainPage = new MainPage(driver);
    mainPage.navigateToRepositoryPage();
    RepositoryPage repositoryPage = new RepositoryPage(driver);
    repositoryPage.navigateToIssuesRepositoryPage();
    IssuesRepositoryPage issuesRepositoryPage = new IssuesRepositoryPage(driver);
    issuesRepositoryPage.navigateToCreateIssuePage();
    CreateIssuePage createIssuePage = new CreateIssuePage(driver);
    createIssuePage.createNewIssue("TitleNewIssue1", "DescNewIssue1");
    CreatedIssuePage createdIssuePage = new CreatedIssuePage(driver);
    Assert.assertTrue(createdIssuePage.getOpenStatusLabel().isDisplayed());
  }
}
