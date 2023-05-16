

Feature:There should be a redirect from the main page to the Gallery page.
      #"  - Run Browser
  #  - Go to https://qa.heallifehospital.com/
  #  - Click Gallery Button
  #  - View Gallery page
  #  - Close page"

  #"  - Browseri Calistir
  #  - https://qa.heallifehospital.com/ sitesine git
  #  - Galery Butonuna tikla
  #  - Galery sayfasini gör
  #  - Sayfayi kapat"
  Scenario: TC_001>>US_013
    Given Go to homeUrl
    Then Click Gallery Button
    Then View Galery Page
    And Closed the browser



#"  - Browseri Calistir
#  - https://qa.heallifehospital.com/ sitesine git
#  - Galery Butonuna tikla
#  - Healt & Wellnes in butona tikla ve sayfanin oldugunu test et
#  - Healts & Wellnes sayfasinda geri cik
#  - Hospitals and Directions butonuna tikla ve sayfanin görünür ldugunu gör,geri cik
#  - Specialities Butonuna tikla ve sayfanin görünür oldugunu gör,geri cik
#  - Recreation Centre butonuna tikla ve sayfanin görünür oldugunu gör,geri cik
#  - Your Health butonuna tikla ve sayfanin görünür oldugunu gör,geri cik
#  - Surgery butonuna tikla ve sayfanin görünür oldugunu gör,geri cik"

  #"  - Run Browser
  #  - Go to https://qa.heallifehospital.com/
  #  - Click the Gallery Button
  #  - Click the button of Health & Wellnes and test that the page exists
  #  - Go back to the Healths & Wellnes page
  #  - Click on the Hospitals and Directions button and see the page appear, exit back
  #  - Click on Specialties Button and see the page is visible, exit back
  #  - Click the Recreation Center button and see the page is visible, exit back
  #  - Click on Your Health button and see the page is visible, exit back
  #  - Click the surgery button and see the page is visible, exit back"

  Scenario: TC_002>>US_013

    Given Go to homeUrl
    Then Click the Gallery Button
    Then Click the button of Health & Wellnes and see the page is visible,exit back
    Then Click on the Hospitals and Directions button and see the page appear, exit back
    Then Click on Specialties Button and see the page is visible, exit back
    Then Click the Recreation Center button and see the page is visible, exit back
    Then Click on Your Health button and see the page is visible, exit back
    Then Click the surgery button and see the page is visible, exit back
    And Closed the browser


