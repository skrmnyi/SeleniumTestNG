package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends ConfigPage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement issuesTab = driver.findElement(By.xpath("//a[contains(text(),'Issues')]"));
    private WebElement codeSpacesTab =
            driver.findElement(By.xpath("//a[contains(text(),'Codespaces')]"));
    private WebElement marketPlaceTab =
            driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]"));

    private WebElement searchJump = driver.findElement(By.xpath("//input[@placeholder=\"Search or jump to…\"]"));

    public WebElement getIssuesTab() {
        return issuesTab;
    }

    public WebElement getCodeSpacesTab() {
        return codeSpacesTab;
    }

    public WebElement getMarketPlaceTab() {
        return marketPlaceTab;
    }

    public IssuesGlobalPage navigateToIssuesGlobalPage() {
        issuesTab.click();
        return new IssuesGlobalPage(driver);
    }

    public void getLinkValue(String linkName) {
        driver.findElement(By.xpath("//li[@class=\"mb-1\"]/a[contains(text(),'" + linkName + "')]"));
    }

    public RepositoryPage jumpToRepository(String repoName) {
        searchJump.sendKeys(repoName);
        driver.findElement(By.xpath("//mark[text()=\"SeleniumTestNG\"]")).click();
        return new RepositoryPage(driver);
    }

    public RepositoryPage navigateToSpecificRepo(String repoName) {
        driver.findElement(By.xpath("//div[@class='wb-break-word']/a[contains(@href,'" + repoName + "')]" +
                "[contains(@data-hydro-click,'location=left')]")).click();
        return new RepositoryPage(driver);
    }


}

