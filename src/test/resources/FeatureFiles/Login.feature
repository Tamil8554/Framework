Feature: To validate Login Functionality in Facebook Application

Background:
 Given User is in facebook login page

Scenario: To validate login using invalid username and password

	When User enter valid username in email field
	
	|Tamil123@gmail.com|Raja123@gmail.com|TR123@gmail.com|
	 
	When User enter valid passord in password field
	
	|12345|67890|09876|
	|54321|09876|65432|
	|raja123|tamil123|tr123|
	
	And User click login button
	Then User has to close the browser
	
	#Scenario Outline: To validate positive & negative functionalities in facebook loginpage
  #When To pass value "<emailfield>" in email field
  #And To pass the value "<passwordfield>" in password field 
  #When To click the login button
  #Then To close the browser
  
  #Examples:
  #|emailfield|passwordfield|
  #|Tamil123  |Raja@123     |
  #|Raja123   |Tamil@123    |
  #|TR123     |TR@123       |