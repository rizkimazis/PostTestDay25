Feature: Checkout Product

  Scenario: User Checkout Product
    When User clicked checkout button
    And User on checkout page
    And User enter firstname
    And User enter lastname
    And User enter companyname
    And User enter countryname
    And User enter address one
    And User enter address two
    And User enter city name
    And User enter province name
    And User enter postCode
    And User enter phone number
    And User enter email address
    And User enter order notes
    And User click terms checkbox
    Then User click button placeorder
    And User on received page
