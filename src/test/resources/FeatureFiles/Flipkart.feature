Feature: To validate flipkart login functionality

  
  Scenario: To validate invalid mailid and invalid password
    Given To get Flipkart url
    When To enter value in email field
    And To enter value in password field
    And To click signin button
    Then To get pagetitle
    
    

  