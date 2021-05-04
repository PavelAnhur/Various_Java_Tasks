package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pattern.pageObject.GitHubPage;
import pattern.webDriver.WebDriverSingleton;

public class LoginPageTest {
    GitHubPage loginOPage = new GitHubPage();

    @AfterMethod
    public void tearDown() {
        WebDriverSingleton.getInstance().quit();
    }

    @Test
    public void loginTest() {
        loginOPage.openPage("https://github.com/login");
        loginOPage.inputEmail();
        loginOPage.inputPassword();
        loginOPage.clickSignIn();
        Assert.assertTrue(true);
    }
}
