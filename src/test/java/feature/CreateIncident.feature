Feature: Incident Management

Background:
Given the base URL
And Set the Auth

Scenario: Get Incident
When GET all incidents
Then assert status code is 200

Scenario: POST/Create Incident
When create incident with String body '{"short_description": "Laptop Services","description": "Laptop Charger services center"}'
Then assert status code is 201

Scenario Outline: POST/Create Incident using External JSON file
When create incident with json '<filename>'
Then assert status code is 201
Examples:
|filename|
|incident1.json|
|incident2.json|




