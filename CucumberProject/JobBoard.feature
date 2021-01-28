@JobBoardProject
Feature: Job Board Acitvities

  Scenario: Create a new user
    Given User is on alchemy job  page
    When User enters admin and password 
    Then User clicks the users menu 
    Then Validate created user
    And Close  browser
    

  Scenario: Searching for jobs using XPath
    Given User is on Jobs page
    When Click the job page   
    Then Search using keyword
    Then Select a job and find the details
    Then Print the title of the job
    Then Apply for the job
    And Close  browser
    
     @test2 
   Scenario: Posting a job using parameterization
    Given User is on Jobs page
    When Click the postjob page   
    Then Fill the details "testjob" and "Description of the job" and "testjob1212@testemail.com" and "SDET" 
    Then Submit the job
    Then Confirm the posted job "testjob"
    And Close  browser
  

  