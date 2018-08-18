Feature: testBranchAddress
  this feature will test if branch has it expected correct address displayed.

  Scenario: verify branch has correct address
    Given I navigate to home page
    And I select a branch
    Then I should see the correct address for selected branch