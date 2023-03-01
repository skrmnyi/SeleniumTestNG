import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.IssuesRepositoryPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RepositoryPage;

public class CheckNoIssuesCreatedMessageTest extends ConfigTest{
  @Test
  public void checkNoIssuesCreatedMessageTest (){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.successfulLogin("skrmnyi", "*******");
    MainPage mainPage = new MainPage(driver);
    mainPage.navigateToRepositoryPage();
    RepositoryPage repositoryPage = new RepositoryPage(driver);
    repositoryPage.navigateToIssuesRepositoryPage();
    IssuesRepositoryPage issuesRepositoryPage = new IssuesRepositoryPage(driver);
    Assertions.assertTrue(issuesRepositoryPage.getNoIssuesMessage().isDisplayed());
  }
}
