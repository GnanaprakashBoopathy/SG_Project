@petstore
Feature: Perform CRUD operations in Petstore Application

Scenario: Perform Create Operation
Given Insert the Header and Body for Creating the Pet details
And Use the Post HTTP method and Pass the Endpoint
Then Validate the status code and name

Scenario: Perform Retrive Operation
Given Insert the Header for Retriving the Pet details
And Use the Get HTTP method and Pass the Endpoint
Then Validate the status code 

Scenario: Perform Update Operation
Given Insert the Header and Body for Updating the Pet details
And Use the Put HTTP method and Pass the Endpoint
Then Validate the status code and updated name

Scenario: Perform Delete Operation
Given Insert the Header for Deleting the Pet details
And Use the Delete HTTP method and Pass the Endpoint
Then Validate the status code for deletion of details