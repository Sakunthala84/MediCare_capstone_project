Feature: Login Functionality
Scenario: A user with valid credentials should able to login

Given A user is on the landing page
When he clicks login button
And he enters valid user name and password
Then he able to login succesfully


Scenario: A user with invalid credentials should able to error message

Given A user is on the landing page
When he clicks login button
And he enters invalid user name and password
Then he able to get error message