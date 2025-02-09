Feature:Open Money Transfer Account

  @TrueLogin
  Scenario:Successfully log in to money transfer
    Given Open Login page to money transfer
    When Enter Username field
    When Enter Password field
    When Click Login button
    Then Check successfully Open Money transferPage loaded
    When Click Open Money transfer button
    Then Check successfully loaded My Account page

  @MoneyTransfer
  Scenario Outline:Money Transfer
    Given Open Money transfer page for given user
    When Note that My Account's Amount value
    And Click Transfer Money button
    When Select Receiver to "<receiver>"
    When Enter Amount "<amount>"
    When Click Send button
    And Note that current time
    Then Compare previous My Accounts amount and current My Accounts amount and check that "<amount>" is true
    And Compare the amount in the transaction information by date with the amount we entered and check the accuracy of the "<amount>"
    Examples:
      |receiver               |amount           |
      |Testinium-1          |0                |
      |Testinium-1          |100              |

  @TrueEditAccount
  Scenario:Edit Account
    Given Open Money transfer page for given user
    When Click Edit Account button
    When Change Account Name to given value
    When Click Update Button
    Then Check the successful change of the Account Name value in the MyAccount field

  @AddMoney
  Scenario Outline:Add Money
    Given Open Money transfer page for given user
    When Click Add Money Button
    When Set Card Number
    When Set Card Holder
    When Set Expire Date
    When Set CVV
    When Set "<amount>"
    When Click Add button
    Then Compare previous My Accounts amount and current My Accounts amount and check that added "<amount>" is true
    Examples:
      | amount            |
      |101                |
      |1                  |

