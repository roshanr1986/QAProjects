@FeatureTest
Feature: update profile
  As an employee i want to update my information such as contact,email,address
  so that my colleagues can view my latest details.

  Background: User login to the profile
    Given I navigate to homepage
    When I fill in username
    And I fill in my password
    And I click on login button
    Then I should be logged in and view welcome message


    Scenario: Update Name
      When I click on update Name option
      And I update "Roshan" with "Roshan Ranasinghe"
      And I click save
      Then I should see update success message

    Scenario: Updatge email
      When I click on update email
      And I update old email with new email
      And I click save email
      Then I should see new email updated



