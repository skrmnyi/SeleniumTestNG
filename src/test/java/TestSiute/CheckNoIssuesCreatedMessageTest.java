package TestSiute;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IssuesRepositoryPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RepositoryPage;

public class CheckNoIssuesCreatedMessageTest extends ConfigTest {
    @Test (priority = 1)
    public void checkNoIssuesCreatedMessageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToRepositoryPage();
        RepositoryPage repositoryPage = new RepositoryPage(driver);
        repositoryPage.navigateToIssuesRepositoryPage();
        IssuesRepositoryPage issuesRepositoryPage = new IssuesRepositoryPage(driver);
        Assert.assertTrue(issuesRepositoryPage.getNoIssuesMessage().isDisplayed());
    }
}
