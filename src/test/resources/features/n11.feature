Feature: Checking Favorite product feature in n11
  As a user, a product should be able to be added to favorites
  and deleted from the section called favorites.


  Scenario: Login as user
    Given N11 website opens
    When user clicks to login button
    Then user should see login page

  Scenario: Login as user with username and password
    When user enters username
    And user enters password
    Then user should see homepage

  Scenario Outline: User enters keyword
    When user enters <string> keyword on the search box
    Then user should see search result page
    Examples:
      | string   |
      | "Iphone" |

  Scenario: User goes to expected element
    When user goes to page2
    And user enter the third element on the second page
    And user click to favorite button on the element
    And user goes to my favorites button in my account button
    And user click to favorites button
    Then user should see My favorites page

  Scenario: User goes to My favorites area
    When user clik to My favorites are
    And user click to delete button under the add cart word
    Then user should't see the last deleted Iphone

  Scenario: User exits to N11 page
    When user goes to my account tab
    And user click to exit button
    Then user should see login page



