Feature: testBranchAddress
  this feature will test if branch has it expected correct address displayed.

  Scenario: verify branch has correct address
    Given I navigate to home page
    Then Following branches should have following addresses
      | BranchName | AddressPrefix        | AddressSuffix                                                        |
      | Agra       | Mercury Travels Ltd. | C/o Hotel Clarks Shiraz, 54, Taj Road, Agra 282 001.                 |
      | Ahmedabad  | Mercury Travels Ltd. | 103 B Abhijeet 1, 1st Floor, Mithakali Six Roads, Ahmedabad 380 006. |
    Then close browser

