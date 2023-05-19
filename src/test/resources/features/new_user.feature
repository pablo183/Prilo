Feature: User Registration as Shipper

  Scenario: Registering a user as Shipper
    Given The user is on the Prilo homepage
    And The user closes the cookie information popup new user
    And The user changes the language to English
    When The user clicks the Sign Up button
    And The user clicks Register as a shipper button
    And The user clicks the Next button to enter company data
    And The user enters the following company details:
      | Field                   | Value              |
      | Country                 | Ukraine            |
      | Company VAT No.         | abc111118          |
      | Company name            | mistrz i małgorzata|
      | Street name and No.     | Lipowa             |
      | Postal Code             | 15-999             |
      | City                    | Bialystok          |
    And The user clicks the Next button to enter user data
    And The user enters the following user details:
      | Field                  | Value                 |
      | Full name              | Leon Zawodowiec       |
      | E-mail address         | pablo183testy+abc111118@gmail.com |
      | Repeat e-mail address  | pablo183testy+abc111118@gmail.com |
      | Phone number           | 666555333             |
      | Password               | !Pablo183             |
      | Repeat password        | !Pablo183             |
    And The user clicks the Next button to read and accept contract conditions
    And The user checks the Select all checkbox
    And The user clicks the Create an account button
    Then The user sees the message "Confirm your e-mail address to join the platform" on the registration success page
