@tag
Feature: Admin Login
  I want to use this template to validate Admin Login

@tag1
Scenario: Check Admin Login with valid data  
Given I open browser with url "http://orangehrm.qedgetech.com"
Then I should see Login Page   
When I Enter username as "Admin"   
And I Enter password as "Qedge123!@#"    
And I click Login       
Then I should see Admin Module       
When I close browser  

@tag2
Scenario Outline: Check Admin Login with invalid data
Given I open browser with url "<url>"   
Then I should see Login Page   
When I Enter username as "<uname>"  
And I Enter password as "<pword>"    
And I click Login
Then I should See Error Message
When I close browser 


Examples:

| url | uname | pword |
|http://orangehrm.qedgetech.com|abc|xyzz|
|http://orangehrm.qedgetech.com|abc|Qedge123!@#|
|http://orangehrm.qedgetech.com|Admin|xyzz|