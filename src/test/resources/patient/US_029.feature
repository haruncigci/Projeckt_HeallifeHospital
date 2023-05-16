Feature: Bloodbank part test

  Scenario:TC_01 It should be verified that there is a Blood Bank menu title in the Dashboard sidebar and when clicked, it redirects to the "bloodbank" page.
    Given user goes to patient login page
    Then The patient logs in with "havva.gokkkaya" and "heallife123".
    Then It is Verified that there is a 'Blood Bank' heading in the dashboard sidebar on the user page.
    Then Blood Bank heading is clicked.
    Then the Blood Bank page has been reached is verified
    And page is closed.



  Scenario:TC_02 It should be verified that patient profile information is displayed in detail on the Blood Bank page.
    Given user goes to patient login page
    Then The patient logs in with "havva.gokkaya" and "heallife123".
    Then Blood Bank heading is clicked.
    Then Verifies that "Patient Id, Gender, Marital Status, Phone, Email, Address, Age, Guardian Name" is displayed.
    And page is closed.


  Scenario: TC_03 It should be verified that it is possible to switch between the Blood Issue and Component Issue pages on the Blood Bank page.
    Given user goes to patient login page
    Then The patient logs in with "havva.gokkaya" and "heallife123".
    Then Blood Bank heading is clicked.
    Then verifies that Blood Issue heading is visible.
    Then verifies that Component Issue heading is visible.
    Then clicks to Component Issue header.
    Then verifies that Component Issue part is displayed.
    Then clicks to Blood Issue header.
    Then verifies that Blood Issue part is displayed.
    And page is closed.


  Scenario: TC_04 Verify that the functions in the Blood Issue section are working
    Given user goes to patient login page
    Then The patient logs in with "havva.gokkaya" and "heallife123".
    Then Blood Bank heading is clicked.
    Then Verifies "Bill No, Issue Date, Received To, Blood Group, Gender, Donor Name, Bags, Amount ($), Paid Amount ($), Balance Amount ($), Action" headers are visible.
    Then Verifies sorting could be done for headers
