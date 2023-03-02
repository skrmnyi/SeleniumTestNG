package TestSiute;

import TestSiute.ConfigTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.IssuesRepositoryPage;
import pages.MainPage;
import pages.RepositoryPage;

public class VerifyAllLinksPresentedOnMainPageTest extends ConfigTest {

    @DataProvider(name = "links")
    public static Object[][] getLink() {
        return new Object[][]{{"Blog"}, {"About"}, {"Shop"}, {"Contact"}, {"GitHub"}, {"Pricing"}, {"API"},
                {"Training"}, {"Status"}, {"Security"}, {"Terms"}, {"Privacy"}, {"Docs"}};
    }

    @Test(priority = 0, dataProvider = "links")
    public void verifyAllLinksPresentedOnMainPageTest(String linkName) {
        MainPage mainPage = new MainPage(driver);
        mainPage.getLinkValue(linkName);

    }
}
