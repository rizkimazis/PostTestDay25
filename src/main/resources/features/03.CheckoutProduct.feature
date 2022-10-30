Feature: Checkout Product

  Scenario: User Checkout Product
    When User go to Web HRM
    And User enter username password invalid
    And User click button login
    Then User invalid credentials