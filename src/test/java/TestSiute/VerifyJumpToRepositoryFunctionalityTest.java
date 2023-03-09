package TestSiute;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RepositoryPage;

public class VerifyJumpToRepositoryFunctionalityTest extends ConfigTest {

    @DataProvider(name = "repositories")
    public static Object[][] getLink() {
        return new Object[][]{{"SeleniumCucumber"}, {"SeleniumJUnit"}, {"SeleniumTestNG"}};
    }

    @Test(priority = 0, dataProvider = "repositories")
    public void VerifyNavigateToRepositoryTest(String repoName) {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToSpecificRepo(repoName);
        RepositoryPage repositoryPage = new RepositoryPage(driver);
        Assert.assertTrue(repositoryPage.getRepoTitle(repoName));
    }
}
