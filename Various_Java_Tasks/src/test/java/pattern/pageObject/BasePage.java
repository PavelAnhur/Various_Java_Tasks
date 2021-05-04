package pattern.pageObject;

import org.openqa.selenium.WebDriver;
import pattern.webDriver.WebDriverSingleton;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage() {
        this.driver = WebDriverSingleton.getInstance().getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }
}
