Feature: Add New Customer
  Background:
    Given I should be on home page "https://demo.guru99.com/v4/"
    When I enter UserID as "mngr391632"
    When I enter Password as "qyrAbAt"
    When I click on LogIn
    Then I should be loggedIn successfully with page title as "Guru99 Bank Manager HomePage"


    Scenario Outline: Verify add new customer functionality by providing valid data
      When I click on New Customer tab to add new customer
      When I enter customer name "<customerName>"
      And I enter Gender "<Gender>"
      And I enter Date of birth "<mm>" "<dd>" "<yyyy>"
      And I enter Address "<Address>"
      And I enter city "<city>"
      And I enter state "<state>"
      And I enter PIN "<PIN>"
      And I enter mobile number
      And I enter E-Mail
      And I enter Password "<password>"
      And I click on submit button
      Then New Customer should be created successfully with message as "<message>"


      Examples:
      |customerName|Gender|mm|dd|yyyy|Address|city|state|PIN|password|message|
      #|customerone   |male  |09|09|1990|Address1|brd  |wm|999999|pass1  |Customer Registered Successfully!!!  |
      #customerID = 91483
      #|customertwo   |female|07|07|1990|Address2|pbr|guj|123456|pass2 |Customer Registered Successfully!!! |
      #customerId = 90626
      #|customerthree   |female|08|08|1996|Address3|ahm|guj|121212|pass3 | Customer Registered Successfully!!! |
      #customerID = 44900
      #|customerfour   |female|09|09|1991|Address4|mum|mhm|123432|pass4 |Customer Registered Successfully!!! |
      #CustomerID = 23096
      |customerfive   |female|10|10|1995|Address5|ahm|guj|667788|pass5 | Customer Registered Successfully!!! |
      #customerID = 12949