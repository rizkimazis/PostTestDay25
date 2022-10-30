Feature: Add Cart Product

  Scenario: User Add Cart One
    When User go to search box
    And User enter name product one
    And User chooses color
    And User chooses size
    And User click quantity product
    And User click button add to cart
    Then User on view cart product page

  Scenario: User Add Cart Two
    When User go to search box
    And User enter name product two
    And User chooses color
    And User chooses size
    And User click quantity product
    And User click button add to cart
    Then User on view cart product page