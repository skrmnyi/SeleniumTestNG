
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends ConfigTest {

    @Test
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("skrmnyi", "*******");
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.getRepoTest().isDisplayed());
        Assert.assertTrue(mainPage.getIssuesTab().isDisplayed());
        Assert.assertTrue(mainPage.getCodeSpacesTab().isDisplayed());
        Assert.assertTrue(mainPage.getMarketPlaceTab().isDisplayed());
    }
}
