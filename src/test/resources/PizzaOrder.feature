Feature: Pizza order functionality

Scenario: Place Pizza order and verify order number
Given Enter the username and password as 'TestUser' and 'Tester5027#'
And Go to Shop on the Menu bar 
And Order a Seafood pizza
And Select Check out
When Select Place your order
Then Print the order number 

