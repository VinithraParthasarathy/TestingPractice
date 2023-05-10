      
Feature: Login functionality check for facebook page 

Scenario: Login the facebook page

Given User launches the fb url
When User enters the username
And User enters the password
And User clicks on login button 
Then User should be on facebook page
