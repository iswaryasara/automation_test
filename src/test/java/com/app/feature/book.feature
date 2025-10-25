Feature: validate the booking hotel  k
@book
Scenario: Validate the  hotel booking
Given Load the browser "Chrome"
    And Load the URL "https://adactinhotelapp.com/"
    When Enter the userName "kumaransiva"
    And  Enter the password "6S0D18"
    And Click the login button
Scenario: Validate the search Hotel    
    When Enter the location "New York"
     And Enter the hotel "Hotel Sunshine"
     And Enter the RoomType "Deluxe" 
     And Enter the no of rooms "1 - One"
     And Enter the checkInDate "15/10/2025"
     And Enter the checkoutDate "20/10/2025" 
     And Enter the Adult "2 - Two"
     And Enter the Child "2 - Two" 
     And Click the Search button
Scenario: Validate the select Hotel      
      When hen Select the Radio botton
      And Click the continue button
Scenario: Validate the book the Hotel        
      When  Enter the firstname "ishu"
      And  Enter the lastname "sara"
      And  Enter the address "Chennai"
      And  Enter the creditCardNo "9876646545976543"
      And  Enter the CardType "VISA"
      And  Enter the expirymonth "March"
      And  Enter the ecpiryYear "2026"
      And  Enter the CcvNo "675" 
      And Click the BookNow button
      And Get the orderNo