Feature: Edit Customer

  Background:
    Given I should be on home page "https://demo.guru99.com/v4/"
    When I enter UserID as "mngr391632"
    When I enter Password as "qyrAbAt"
    When I click on LogIn
    Then I should be loggedIn successfully with page title as "Guru99 Bank Manager HomePage"

      Scenario Outline: Verify Edit Customer Address by providing valid customer ID
        When I click on Edit Customer tab
        When I enter valid customer ID "<customerId>"
        When I click on submit
        When I edit Address as "<Address>"
        When I edit city "<city>"
        When I edit state "<state>"
        When I edit pincode "<pincode>"
        When I click on submit
        Then I should get message as "<expmessage>"

        Examples:
        |customerId|Address     |city|state|pincode|expmessage|
        |44900     |AddressThree|birmingham|guj|454545|Customer edited successfully|
