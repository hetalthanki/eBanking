Feature: Login

  Scenario Outline: Verify manager login to the application
    Given I should be on home page "https://demo.guru99.com/v4/"
    When I enter UserID as "<UserID>"
    When I enter Password as "<password>"
    When I click on LogIn
    Then I should be loggedIn successfully with page title as "<ExpectedPageTitle>"

    Examples:
    |UserID           |password       |ExpectedPageTitle              |
    |mngr391632       | qyrAbAt       | Guru99 Bank Manager HomePage  |
    #| mngr392373      |  ytUhana      |  Guru99 Bank Manager HomePage |
    #| Mngr1111        | aaaaaa        |Guru99 Bank Manager HomePage   |
    #|Mngr8888         |bbbbbb         |Guru99 Bank Manager HomePage   |
    #| Mngr9999        |  cccccc       |Guru99 Bank Manager HomePage   |