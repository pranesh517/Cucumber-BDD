Feature: To verify Login functionality

@smoke
Scenario: To Verify successful Login
Given User is having valid URL
When User enters Email ID
And User enters Password
And User clicks on Login button
Then Login is Successful

Scenario Outline: To Verify Login with multiple Data
Given User is having valid URL
When User enters multiple userid '<userid>'
And User enters multiple password '<password>'
And User clicks on Login button
Then Login is Successful
Examples:
|userid|password|
|123@test.com|123456|
|xyz@test.com|987456|
