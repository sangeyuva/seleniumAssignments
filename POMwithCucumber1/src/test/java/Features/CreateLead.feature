Feature: Login leaftap application
Background:
Given Launch browser
And load the url
Given enter the username as 'Demosalesmanager'
And enter the password as 'crmsfa'
When click on Login button
Then homepage should be displayed
When clicked on CRMFSA link
And click on Leads link



Scenario Outline: Create Lead with multiple data
And Click on Create Lead link
Given Enter the company name as '<compName>'
And Enter first name '<fname>'
And Enter Last Name <lname>
And Enter phone Number <phno>
Then Click submit button
Then viewLead page should be displayed '<compName>'


Examples:
|compName|fname|lname|phno|
|Infosys| Sanuya | G| 91|
|QEagle| sam|s|92|
#|Mphasis|jj|kl|93|

#Scenario Outline: Edit Lead with multiple data
#When click on FindLeads Link
#And Search leads by Phone Number <phNo>
#And Click on findLeads button
#And Click on Edit Leads button
#And Update Company Name <compName>
#When click on Submit button
#Then Verify lead is edited <compName>
#
#Examples:
#|phNo|compName|
#|92|TCS|
#|91|CTS|








