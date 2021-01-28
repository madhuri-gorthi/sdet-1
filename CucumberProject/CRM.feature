@CRMProject
Feature: CRM Activities

  Scenario: Counting Dashlets
    Given User is on CRM  page
    When User enters CRM 
    Then Count the number of Dashlets 
    Then Print the number and title of each Dashlet
    And Close CRM browser
   

  Scenario: Create leads using parameters
    Given User is on CRM  page
    When User enters CRM 
    Then Go to sales tab and select leads
    Then Fill in the details and save
    Then Go to view leads
    And Close CRM browser
   

   Scenario: Schedule meeting 
    Given User is on CRM  page
    When User enters CRM 
    Then Go to Activities tab and select meeting
    Then Fill the details of the meeting
    Then Invite members:
    |newlead1|
    |newlead2|
    Then Go to view Meetings and confirm
    And Close CRM browser 
    
   
  Scenario Outline: Creating a Product
    Given User is on CRM  page
    When User enters CRM 
    Then select Products tab
    Then Fill in the product details "<productName>" , "<price>" and save
    Then Go to view products "<productName>"
    And Close CRM browser
    
 Examples:
      |productName|price|
      |table|5000 |
      |chair|3000|
    