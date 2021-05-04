package pattern.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHubPage extends BasePage {
    private static final String LOGIN_FIELD = "login_field";
    private static final String PASSWORD = "password";
    private static final String GMAIL_COM = "apsdfasf@gmail.com";
    private static final String PASSWORD_VALUE = "asdfsf12346545";
    private static final String SIGN_IN = "*[value^='Sign']";

    public void inputEmail() {
        new WebDriverWait(getDriver(), 10).until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(LOGIN_FIELD)));
        getDriver().findElement(By.id(LOGIN_FIELD)).sendKeys(GMAIL_COM);
    }

    public void inputPassword() {
        getDriver().findElement(By.id(PASSWORD)).sendKeys(PASSWORD_VALUE);
    }

    public void clickSignIn() {
        getDriver().findElement(By.cssSelector(SIGN_IN)).click();
    }
}
