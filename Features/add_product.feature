Feature: Add new product functionality

  Scenario: An admin should able to add new product
    Given user is navigated to landing page of medicare application
    When user is clicks login button
    And he entered valid credentials of admin user
    And he should able to log in as admin
    And he click on manage product
    And he click on add new category
    And he enters name and type of category
    And he clicks save button
    Then admin can add new category successfully
