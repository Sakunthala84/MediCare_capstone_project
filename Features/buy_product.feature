Feature: buy product functionality

  Scenario: An user should able to add the product and do the payment
    Given An user is in the landing page
    When he clicks show product image button
    And he adds the product in the cart
    And he enters card details
    And he confirms the payment
    Then user should able to buy the product successfully
