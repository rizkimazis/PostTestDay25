Feature: Login User

  Scenario: User valid login
    When User go to Web DEMOQA
    And User enter username password valid
    And User click button login
    Then User on My Account Page

