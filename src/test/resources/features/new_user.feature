Feature: User Registration as Shipper

  Scenario: Registering a user as Shipper
    Given The user is on the Prilo homepage
    And The user closes the cookie information popup new user
    When The user clicks the Sign Up button
    And The user clicks Register as a shipper button
    And The user clicks the Next button to enter company data
    And The user
    And The user enters Country as "Ukraine"
    And The user enters Company VAT No. as "<vat_number>"
    And The user enters Company name as "<company_name>"
    And The user enters Street name and No. as "<street_name_and_number>"
    And The user enters Postal Code as "<postal_code>"
    And The user enters City as "<city>"
    And The user clicks the Next button enter user data
    And The user enters Full name as "<full_name>"
    And The user enters E-mail address as "<email_address>"
    And The user enters Repeat e-mail address as "<repeat_email_address>"
    And The user enters Phone number as "<phone_number>"
    And The user enters Password as "<password>"
    And The user enters Repeat password as "<repeat_password>"
    And The user clicks the Next button read and accept contract conditions
    And The user checks the Select all checkbox
    And The user clicks the Create an account button
    Then The user sees the message "Confirm your e-mail address to join the platform" on the registration success page