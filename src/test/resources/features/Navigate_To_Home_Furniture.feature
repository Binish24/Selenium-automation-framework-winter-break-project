@NavigateToHomeFurniture
  Feature: navigate to Flipkart Home Furniture page

    Scenario: navigate successfully to Home and page
      Given I am on Flipkart web main page
      When I place the mouse on Home and Furniture button
      And I drag and place the mouse on the Cleaning and Bath button
      And I click on Mops button
      Then I will navigated to the Mops page