package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MoneyTransferPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    public MoneyTransferPage(WebDriver driver){
        this.driver =driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper =new ElementHelper(driver);
    }
    public static String receiver;

    static By receiverAccountDropdown= By.xpath("//div[.='Testinium-1Testinium-5Testinium-4Testinium-3Testinium-2']");

    static By amountLabel = By.cssSelector("[placeholder]");
    static By sendButton = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']/div[.='Send']");

    public void selectReceiverTo(String elementValue) {
        receiver=elementValue;
        By receiverOption = By.xpath("//option[.='"+receiver+"']");
        elementHelper.click(receiverAccountDropdown);
        elementHelper.click(receiverOption);
    }

    public void enterAmount(String elementValue) {
        elementHelper.sendKey(amountLabel,elementValue);
    }

    public void clickSendButton() {
        elementHelper.click(sendButton);
    }
}
