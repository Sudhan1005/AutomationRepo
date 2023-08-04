@GetCEOName
Feature: This feature is to get the CEO name from the OrangeHRM app
Scenario Outline: This test is to verify the CEO name
Given the user is logged in successfully and is on home page
When the user clicks on the directory option from the menu bar
And the user selects the job title as "CEO" from the drop down
And clicks the search button
Then the user should see the CEo name as "<CEO_Name>"
Examples:
|CEO_Name|
|John_Smith| 