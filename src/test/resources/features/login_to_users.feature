Feature: Logging in to the Prilo platform

  Scenario Outline: Successful login with multiple users
    Given The user is on the Prilo login page
    And The users closes the cookie information popup
    When The users enters a valid email "<email>"
    And The users enters a valid password "<password>"
    And The users clicks the login button
    Then The users is redirected to the homepage

    Examples:
      | email                       | password   |
      | pablo183testy@gmail.com     | !Pablo183  |
      | pablo183testy1@gmail.com    | !Pablo183  |
      | shipper.chaos1@gmail.com   | !Pablo183  |