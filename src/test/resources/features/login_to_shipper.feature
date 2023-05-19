Feature: Logging in to the Prilo platform

  Scenario: Successful login as Shipper
    Given The user is on the Prilo homepage
    And The user closes the cookie information popup
    When The user enters a valid email "pablo183testy@gmail.com"
    And The user enters a valid password "!Pablo183"
    And The user clicks the login button
    Then The user is redirected to the homepage
