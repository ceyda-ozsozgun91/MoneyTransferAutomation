package Pages;

import Util.ElementHelper;
//import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;

public class AccountPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }
    public static String firstAccountName= "JJakkaya";
    public static String myAccountValue;
    public static double myAccountInt= 0;
    public static String transactiontime;
    public static String lastTransactionAmountValue;
    public static String accountName;
    NumberFormat format = NumberFormat.getNumberInstance(Locale.US);

    static By accountAmount = By.xpath("//div[@class='css-175oi2r r-14lw9ot r-z2wwpe r-edyy15']//div[@class='css-175oi2r']//div[@style='flex-direction: row;']/parent::div[@class='css-175oi2r']/div/div");
    static By transferMoneyButton = By.xpath("//*[contains(text(),'Transfer money')]");
    //static By lastTransactionTime = By.xpath("//div[.='"+transactiontime+"']");
    static By lastTransactionAmount =By.xpath("//div[.='Time: "+transactiontime+"']/following-sibling::div/div/div");
    static By editAccountButton = By.xpath("//*[contains(text(),'Edit account')]");
    static By myAccountName= By.xpath("//div[@class='css-175oi2r r-14lw9ot r-z2wwpe r-edyy15']//div[contains(text(),'Account name')]/following-sibling::div");
    static By addmoneyButton = By.xpath("//*[contains(text(),'Add money')]");

    public void noteThatMyAccountSAmountValue() {

        myAccountValue= elementHelper.getText(accountAmount);

        try {
            Number number = format.parse(myAccountValue);
            myAccountInt = number.doubleValue();
            System.out.println("My Account Amount Value: " + myAccountInt);
        } catch (Exception e) {
            System.out.println("My Account Amount Value not found. Because of Exception: " + e);
        }
    }

    public void clickTransferMoneyButton() {
        elementHelper.click(transferMoneyButton);
    }

    public void noteThatCurrentTime() {
        transactiontime= LocalDateTime.now().toString();
    }

    public void compareAndCheckAccountWithTransferedMoney(String transferedAmount) {
        lastTransactionAmountValue=elementHelper.getText(lastTransactionAmount);

        Assert.assertEquals(lastTransactionAmountValue,transferedAmount);
    }

    public void compareAndCheckAccountWithTransferedMoneyInMyAccount(String transferedAmountstr) {
        double transferedAmount=0;
        try {
            Number number = format.parse(transferedAmountstr);
            transferedAmount = number.doubleValue();
            System.out.println("Transferred value: " + transferedAmount);
        } catch (ParseException e) {
            System.out.println("Transferred value not found. Because of Exception: " + e);
        }
        double lastAmount= (myAccountInt-transferedAmount);
        noteThatMyAccountSAmountValue();
        Assert.assertEquals(lastAmount,myAccountInt);
    }

    public void clickEditAccountButton() {
        elementHelper.click(editAccountButton);

    }
    public void checkTheSuccessfulChangeOfTheAccountNameValueInTheMyAccountField() {
        accountName= elementHelper.getText(myAccountName);
        Assert.assertEquals(accountName,"JJakkaya");

    }


    public void clickAddMoneyButton() {
        elementHelper.click(addmoneyButton);
    }

    public void compareAndCheckAccountWithAddedMoneyInMyAccount(String addedAmountStr) {
        double addedAmount=0;
        try {
            Number number = format.parse(addedAmountStr);
            addedAmount = number.doubleValue();
            System.out.println("Transferred value: " + addedAmount);
        } catch (ParseException e) {
            System.out.println("Transferred value not found. Because of Exception: " + e);
        }
        double lastAmount= (myAccountInt+addedAmount);
        noteThatMyAccountSAmountValue();
        Assert.assertEquals(lastAmount,myAccountInt);
    }
}
