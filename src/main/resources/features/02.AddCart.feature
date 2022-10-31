Feature: Add Cart Product

  Scenario: User Add Cart One
    When User go to search box item one
    And User enter name product one
    And User chooses color item one
    And User chooses size item one
    And User click quantity product one
    And User click button add to cart item one
    Then User on view cart product page one

  Scenario: User Add Cart Two
    When User go to search box item two
    And User enter name product two
    And User chooses color item two
    And User chooses size item two
    And User click quantity product item two
    And User click button add to cart item two
    Then User on view cart product page two