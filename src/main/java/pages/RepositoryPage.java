package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepositoryPage extends ConfigPage {
    public RepositoryPage(WebDriver driver) {
        super(driver);
    }

    WebElement issuesTab =
            driver.findElement(By.xpath("//span[@data-content=\"Issues\"]/parent::a"));
    WebElement pullRequests = driver.findElement(By.xpath("//span[@data-content=\"Pull requests\"]"));

    public boolean getRepoTitle(String repoName) {
        WebElement repoTitle = driver.findElement(By.xpath("//a[text()='" + repoName + "']"));
        return true;
    }

    public IssuesRepositoryPage navigateToIssuesRepositoryPage() {
        issuesTab.click();
        return new IssuesRepositoryPage(driver);
    }
}
