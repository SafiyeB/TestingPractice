Feature:

  Background:
    Given user is on main page
@smoketest
  Scenario: registration
    #As a user, I should be able to register with valid credentials
    Given click on sign in button
    And enter email address to registration field
    And click on create an account button
    And choose title
    And enter firstname
    And enter lastname
    And enter password
    And select date of birth
    And enter address
    And enter city
    And select state
    And enter zipcode
    And select country
    And enter mobile phone
    And enter address alias
    And enter address alias
    And click on register button
    Then verify that my account text is visible
    And close the application





