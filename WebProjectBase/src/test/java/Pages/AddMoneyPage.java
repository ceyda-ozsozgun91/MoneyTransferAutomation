package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddMoneyPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    public AddMoneyPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }
    static By cardNumberLabel= By.xpath("//div[.='Card number']//input[contains(@class, 'css-11aywtz')]");
    static By cardHolder = By.cssSelector(".r-1pi2tsx.r-150rngu div:nth-of-type(4) > [placeholder]");
    static By expiryDate = By.cssSelector("[placeholder='MM/YY']");
    static By cvvLabel = By.cssSelector(".r-1pi2tsx.r-150rngu > .css-175oi2r > .css-175oi2r > div:nth-of-type(2) [placeholder]");
    static By amountLabel =By.xpath("//div[.='Amount']//input[contains(@class, 'css-11aywtz')]");
    static By addButton = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']/div[@class='css-146c3p1 r-jwli3a r-1b43r93']");



    public void setCardNumber(String element){
        elementHelper.checkVisible(cardNumberLabel);
        elementHelper.sendKey(cardNumberLabel,element);
    }

    public void setCardHolder(String element){
        elementHelper.sendKey(cardHolder,element);
    }

    public void setExpireDate(String element){
        elementHelper.sendKey(expiryDate,element);
    }

    public void setCVV(String element){
        elementHelper.sendKey(cvvLabel,element);
    }

    public void addAmount(String element) {
        elementHelper.checkVisible(amountLabel);
        elementHelper.sendKey(amountLabel,element);
    }

    public void clickAddButton() {
        elementHelper.checkVisible(addButton);
        elementHelper.click(addButton);

    }

}
