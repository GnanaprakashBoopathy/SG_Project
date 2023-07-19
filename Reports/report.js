$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/FeatureFiles/Amazon.feature");
formatter.feature({
  "name": "Search in Amazon Application and validate the results",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "name": "Search for iPhone and the First result is validated",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Goto Amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.goto_Amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for iPhone",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.search_for_iPhone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the first result contains iPhone",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon.validate_the_first_result_contains_iPhone()"
});
formatter.write("The Result contains iPhone");
formatter.result({
  "status": "passed"
});
formatter.uri("./src/test/resources/FeatureFiles/PetStore.feature");
formatter.feature({
  "name": "Perform CRUD operations in Petstore Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@petstore"
    }
  ]
});
formatter.scenario({
  "name": "Perform Create Operation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Insert the Header and Body for Creating the Pet details",
  "keyword": "Given "
});
formatter.match({
  "location": "PetStore.insert_the_Header_and_Body_for_Creating_the_Pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use the Post HTTP method and Pass the Endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "PetStore.use_the_Post_HTTP_method_and_Pass_the_Endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the status code and name",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.validate_the_status_code_and_name()"
});
formatter.write("{\n    \"id\": 1,\n    \"category\": {\n        \"id\": 1,\n        \"name\": \"string\"\n    },\n    \"name\": \"doggie\",\n    \"photoUrls\": [\n        \"string\"\n    ],\n    \"tags\": [\n        {\n            \"id\": 1,\n            \"name\": \"string\"\n        }\n    ],\n    \"status\": \"available\"\n}");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform Retrive Operation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Insert the Header for Retriving the Pet details",
  "keyword": "Given "
});
formatter.match({
  "location": "PetStore.insert_the_Header_for_Retriving_the_Pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use the Get HTTP method and Pass the Endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "PetStore.use_the_Get_HTTP_method_and_Pass_the_Endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the status code",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.validate_the_status_code()"
});
formatter.write("{\n    \"id\": 1,\n    \"category\": {\n        \"id\": 1,\n        \"name\": \"string\"\n    },\n    \"name\": \"doggie\",\n    \"photoUrls\": [\n        \"string\"\n    ],\n    \"tags\": [\n        {\n            \"id\": 1,\n            \"name\": \"string\"\n        }\n    ],\n    \"status\": \"available\"\n}");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform Update Operation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Insert the Header and Body for Updating the Pet details",
  "keyword": "Given "
});
formatter.match({
  "location": "PetStore.insert_the_Header_and_Body_for_Updating_the_Pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use the Put HTTP method and Pass the Endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "PetStore.use_the_Put_HTTP_method_and_Pass_the_Endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the status code and updated name",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.validate_the_status_code_and_updated_name()"
});
formatter.write("{\n    \"id\": 1,\n    \"category\": {\n        \"id\": 1,\n        \"name\": \"string\"\n    },\n    \"name\": \"cat\",\n    \"photoUrls\": [\n        \"string\"\n    ],\n    \"tags\": [\n        {\n            \"id\": 1,\n            \"name\": \"string\"\n        }\n    ],\n    \"status\": \"available\"\n}");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform Delete Operation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Insert the Header for Deleting the Pet details",
  "keyword": "Given "
});
formatter.match({
  "location": "PetStore.insert_the_Header_for_Deleting_the_Pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use the Delete HTTP method and Pass the Endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "PetStore.use_the_Delete_HTTP_method_and_Pass_the_Endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the status code for deletion of details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.validate_the_status_code_for_deletion_of_details()"
});
formatter.write("{\n    \"code\": 200,\n    \"type\": \"unknown\",\n    \"message\": \"1\"\n}");
formatter.result({
  "status": "passed"
});
});