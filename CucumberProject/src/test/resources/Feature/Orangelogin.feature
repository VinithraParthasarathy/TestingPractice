Feature: Orange HRM Page functionality check 

Scenario: Login the page with valid credentials 

Given User is on orange hrm page 
When User enters the username for login page
And User enters the password for login page 
And User clicks on login button in login page 
Then User should see the homepage 

Scenario: Login the page with valid credentials using parameters

Given User is on orange hrm page 
When User enters the username "Admin" for login page
And User enters the password "admin123" for login page 
And User clicks on login button in login page 
Then User should see the homepage 

@Outline
Scenario Outline: Login the page with invalid credentials 

Given User is on orange hrm page 
When User enters the username "<username>" for login page
And User enters the password "<password>" for login page 
And User clicks on login button in login page 
Then User should see the homepage 

Examples: 
|username|password|
|oranium |48984439|
|Tech    | 594549 |
|Admin   |admin123|