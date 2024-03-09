Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant result

  Scenario: Search page difficult title verification

    When user is on the Google search page
    Then user should see that title is Google
