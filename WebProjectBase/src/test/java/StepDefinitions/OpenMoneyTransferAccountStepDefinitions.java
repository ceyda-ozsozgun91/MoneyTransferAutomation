package StepDefinitions;

import Pages.*;
import Util.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenMoneyTransferAccountStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(OpenMoneyTransferAccountStepDefinitions.class);
    WebDriver driver= DriverFactory.getDriver();
    LoginPage loginPage =new LoginPage(driver);
    MoneyTransferPage moneyTransferPage = new MoneyTransferPage(driver);
    EditAccountPage editAccountPage = new EditAccountPage(driver);
    AddMoneyPage addMoneyPage = new AddMoneyPage(driver);
    AccountPage accountPage = new AccountPage(driver);

    @Given("Open Login page to money transfer")
    public void openLoginPageToMoneyTransfer() {
        loginPage.openLoginPageToMoneyTransfer();
    }

    @When("Enter Username field")
    public void enterUsernameField() {
        loginPage.enterUsernameField();
    }

    @When("Enter Password field")
    public void enterPasswordField() {
        loginPage.enterPasswordField();
    }

    @When("Click Login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Check successfully Open Money transferPage loaded")
    public void checkSuccessfullyOpenMoneyTransferPageLoaded() {
        loginPage.checkSuccesfullyOpenMoneyTransferPageLoaded();
    }

    @When("Click Open Money transfer button")
    public void clickOpenMoneyTransferButton() {
        loginPage.clickOpenMoneyTransferButton();
    }

    @Then("Check successfully loaded My Account page")
    public void checkSuccessfullyLoadedMyAccountPage() {
        loginPage.checkSuccesfullyLoadedMyAccountPage();
    }

    @Given("Open Money transfer page for given user")
    public void openMoneyTransferPageForGivenUser() {
        loginPage.openLoginPageToMoneyTransfer();
        loginPage.enterUsernameField();
        loginPage.enterPasswordField();
        loginPage.clickLoginButton();
        loginPage.checkSuccesfullyOpenMoneyTransferPageLoaded();
        loginPage.clickOpenMoneyTransferButton();
        loginPage.checkSuccesfullyLoadedMyAccountPage();
    }

    @When("Note that My Account's Amount value")
    public void noteThatMyAccountSAmountValue() {
        accountPage.noteThatMyAccountSAmountValue();
    }

    @And("Click Transfer Money button")
    public void clickTransferMoneyButton() {
        accountPage.clickTransferMoneyButton();
    }

    @When("Select Receiver to {string}")
    public void selectReceiverTo(String elementValue) {
        moneyTransferPage.selectReceiverTo(elementValue);
    }

    @When("Enter Amount {string}")
    public void enterAmount(String elementValue) {
        moneyTransferPage.enterAmount(elementValue);
    }

    @When("Click Send button")
    public void clickSendButton() {
        moneyTransferPage.clickSendButton();
    }

    @And("Note that current time")
    public void noteThatCurrentTime() {
        accountPage.noteThatCurrentTime();

    }


    @Then("Compare previous My Accounts amount and current My Accounts amount and check that {string} is true")
    public void comparePreviousMyAccountsAmountAndCurrentMyAccountsAmountAndCheckThatIsTrue(String arg0) {
        accountPage.compareAndCheckAccountWithTransferedMoneyInMyAccount(arg0);

    }

    @And("Compare the amount in the transaction information by date with the amount we entered and check the accuracy of the {string}")
    public void compareTheAmountInTheTransactionInformationByDateWithTheAmountWeEnteredAndCheckTheAccuracyOfThe(String arg0) {
        accountPage.compareAndCheckAccountWithTransferedMoney(arg0);
    }

    @When("Click Edit Account button")
    public void clickEditAccountButton() {
        accountPage.clickEditAccountButton();
    }

    @When("Change Account Name to given value")
    public void changeAccountNameToGivenValue() {
        editAccountPage.changeAccountNameToGivenValue();
    }

    @When("Click Update Button")
    public void clickUpdateButton() {
        editAccountPage.clickUpdateButton();
    }

    @Then("Check the successful change of the Account Name value in the MyAccount field")
    public void checkTheSuccessfulChangeOfTheAccountNameValueInTheMyAccountField() {
        accountPage.checkTheSuccessfulChangeOfTheAccountNameValueInTheMyAccountField();
    }

    @When("Click Add Money Button")
    public void clickAddMoneyButton() {
        accountPage.clickAddMoneyButton();
    }

    @When("Set Card Number")
    public void setCardNumber(){
        addMoneyPage.setCardNumber("1234123412341234");
    }

    @When("Set Card Holder")
    public void setCardHolder(){
        addMoneyPage.setCardHolder("Ceyda Akkaya");
    }

    @When("Set Expire Date")
    public void setExpireDate() {
        addMoneyPage.setExpireDate("10/26");
    }

    @When("Set CVV")
    public void setCVV(){
        addMoneyPage.setCVV("110");
    }

    @When("Set Amount")
    public void setAmount() {
        addMoneyPage.addAmount("101");
    }

    @When("Click Add button")
    public void clickAddButton() throws InterruptedException {
        addMoneyPage.clickAddButton();
    }


    @When("Set {string}")
    public void set(String arg0) {
        addMoneyPage.addAmount(arg0);
    }

    @Then("Compare previous My Accounts amount and current My Accounts amount and check that added {string} is true")
    public void comparePreviousMyAccountsAmountAndCurrentMyAccountsAmountAndCheckThatAddedIsTrue(String arg0) {
        accountPage.compareAndCheckAccountWithAddedMoneyInMyAccount(arg0);
    }
}
