
#"  - Launch Browser
#  - Go to https://qa.heallifehospital.com/
#  - Detect if the page is visible
#  - Close Website"


Feature: US_001 The website must be accessible from the browser with the user (the given URL)

  Scenario: TC_01
    Given Type homeUrl in the Address Bar and press enter.
    And Closed the browser

  Scenario: TC_02
    Given Go to homeUrl
    And Detect if the page is visible
