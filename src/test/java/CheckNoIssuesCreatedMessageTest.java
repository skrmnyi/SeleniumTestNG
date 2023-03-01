
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IssuesRepositoryPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RepositoryPage;

public class CheckNoIssuesCreatedMessageTest extends ConfigTest {
    @Test
    public void checkNoIssuesCreatedMessageTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("skrmnyi", "*******");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToRepositoryPage();
        RepositoryPage repositoryPage = new RepositoryPage(driver);
        repositoryPage.navigateToIssuesRepositoryPage();
        IssuesRepositoryPage issuesRepositoryPage = new IssuesRepositoryPage(driver);
        Assert.assertTrue(issuesRepositoryPage.getNoIssuesMessage().isDisplayed());
    }
}
