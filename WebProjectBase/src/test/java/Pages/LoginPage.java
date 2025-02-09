package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    private String username="Ceyda Akkaya";
    private String password= "4NgelsNeverdie";
    public static String MyAccountName= "JJakkaya";

    static By usernameField =By.cssSelector("[placeholder='Username']");
    static By passwordField = By.cssSelector("[placeholder='Password']");
    static By loginButton = By.xpath("//*[contains(text(),'Login')]");
    static By openMoneyTransferButton = By.xpath("//*[contains(text(),'Open Money Transfer')]");
    static By loadedMyAccountPage = By.xpath("//*[contains(text(),'"+MyAccountName+"')]");
    public LoginPage(WebDriver driver){
        this.driver =driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper =new ElementHelper(driver);
    }

    public void openLoginPageToMoneyTransfer() {
        elementHelper.findElement(usernameField);
    }

    public void enterUsernameField() {
        elementHelper.sendKey(usernameField,username);
    }

    public void enterPasswordField() {
        elementHelper.sendKey(passwordField,password);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);
    }

    public void checkSuccesfullyOpenMoneyTransferPageLoaded() {
        elementHelper.checkVisible(openMoneyTransferButton);
    }

    public void clickOpenMoneyTransferButton() {
        elementHelper.click(openMoneyTransferButton);
    }

    public void checkSuccesfullyLoadedMyAccountPage() {
            elementHelper.checkVisible(loadedMyAccountPage);
    }
}
