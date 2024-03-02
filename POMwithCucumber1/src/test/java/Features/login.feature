Feature: Login leaftap application
Background:
Given Launch browser
And load the url


Scenario: Login with positive credentials
Given enter the username as 'Demosalesmanager'
And enter the password as 'crmsfa'
When click on Login button
Then homepage should be displayed

Scenario: Login with incorrect Credentials
Given enter the username as 'Demosalesmanager1'
And enter the password as 'crmsfa1'
When click on Login button
But Error Message should be displayed





