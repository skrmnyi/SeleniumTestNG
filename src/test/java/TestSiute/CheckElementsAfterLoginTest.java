package TestSiute;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class CheckElementsAfterLoginTest extends ConfigTest {

    @Test(priority = 0)
    public void successfulLogin() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.getRepoTest().isDisplayed());
        Assert.assertTrue(mainPage.getIssuesTab().isDisplayed());
        Assert.assertTrue(mainPage.getCodeSpacesTab().isDisplayed());
        Assert.assertTrue(mainPage.getMarketPlaceTab().isDisplayed());
    }
}
