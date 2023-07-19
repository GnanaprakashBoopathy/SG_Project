@amazon
Feature: Search in Amazon Application and validate the results
Scenario: Search for iPhone and the First result is validated
Given Goto Amazon url
When Search for iPhone
Then Validate the first result contains iPhone