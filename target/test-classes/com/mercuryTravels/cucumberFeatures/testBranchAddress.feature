Feature: test branch address

  @SmokeTest
  Scenario Outline: Verify branch has correct address in HomePage
    Given I navigate MT homepage
    And I select <branchname>
    Then I fetch the <addressprefix> and <addresssuffix>
    Then Verify the address with branch
    Then close the browser

    Examples:
      | branchname | addressprefix        | addresssuffix                                                        |
      | Agra       | Mercury Travels Ltd. | C/o Hotel Clarks Shiraz, 54, Taj Road, Agra 282 001.                 |
      | Ahmedabad  | Mercury Travels Ltd. | 103 B Abhijeet 1, 1st Floor, Mithakali Six Roads, Ahmedabad 380 006. |
      | Bangalore  | Mercury Travels Ltd. | 125, Infantry Road, Bangalore 560 001.                               |