Feature: Login into the Amazon Profile
  As a customer I want to login into my amazon profile
  To check my order status.

  Scenario: To verify if user is able to login into the amazon profile.

    Given user is in Amazon 'Homepage'.
    And user sees 'Hello.Sign in Your order' label.

    When user hover over the 'Hello.Sign in Your order' label
    And Pop-up appears having 'Sign in' button
    And user click on 'Sign in' button
    And user is redirected to Amazon login page.
    And user sees 'Login' label
    And user enters 'Email or mobile phone number' and 'password'
    And user click on 'Login' button

    Then user should be logged in and navigated to Amazon homepage.
    And user ID should be displayed as 'Hello,username Your order' instead of 'Hello. Sign in Your order' label


