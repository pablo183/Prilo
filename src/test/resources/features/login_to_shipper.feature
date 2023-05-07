Feature: Logging in to the Prilo platform

  Scenario: Successful login as Shipper
    Given The user is on the Prilo login page
    And The user closes the cookie information popup
    When The user enters a valid email "pablo183testy@gmail.com" and password "!Pablo183"
    And The user clicks the login button
    Then The user is redirected to the homepage
