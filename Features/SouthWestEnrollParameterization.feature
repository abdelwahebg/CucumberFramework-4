Feature: User Profile Management

Scenario: Enroll to South West Application

Given Application should be launched
When User clicks Enroll link on Home Screen
And Enters "FirstName" and "LastName"
Then Aplication should be closed
