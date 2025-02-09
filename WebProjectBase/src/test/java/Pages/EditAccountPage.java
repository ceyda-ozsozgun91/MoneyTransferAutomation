package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditAccountPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    public EditAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }
    public static String MyAccountName= "ceydaAkkaya";
    public static String EditedAccountName;

    static By accountNameLabel = By.cssSelector("[placeholder]");
    static By updateButton = By.xpath("//*[contains(text(),'UPDATE')]");

    public void changeAccountNameToGivenValue() {
        elementHelper.clear(accountNameLabel);
        elementHelper.sendKey(accountNameLabel,"JJakkaya");
    }

    public void clickUpdateButton() {
        elementHelper.click(updateButton);
    }


}
