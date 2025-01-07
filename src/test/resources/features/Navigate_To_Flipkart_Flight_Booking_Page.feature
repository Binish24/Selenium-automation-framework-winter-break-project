@Navigation
  Feature: Navigate to Flight Booking page

    Scenario: Navigate successfully to flight booking page
      Given I am on Flipkart web main page
      When I click on Flight Bookings button
      And I select One Way Trip
      And I click on From input field and select the origin
      And I click on To input field and select the destination
      And I click on Depart On button and select and depart exact date
      And I click on Travellers and Class button and select Travellers and Cabin Class
      And I click on Search button
      Then I will see the result of my search

