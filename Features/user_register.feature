Feature: New User registration functionality
Scenario: A new user should able to register in application
Given  An user is on the landing page
When he clicks on Sign up button
And he enters valid details
And he enters valid address 
And he clicks confirm button
Then an user should able to register and login successfully
