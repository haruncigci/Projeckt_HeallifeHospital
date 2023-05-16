Feature: "As a user (patient) I would like to have the Radiology page on my Dashboard
  so that I can access and complete my Radiology test results."
  #"  - Run Browser
  #  - Enter https://qa.heallifehospital.com/site/userlogin
  #  - Enter Username and Passwort
  #  - Click the Sign in Button
  #  - Click on the Radiology button from the Dashboard
  #  - See the Radiology page open
  #  - Close Page"

  #"  - Browser Calistir
  #  - https://qa.heallifehospital.com/site/userlogin adresini gir
  #  - Username ve Passwort gir
  #  -Sign in Butonunu tikla
  #  - Dashboarddan Radiology butonuna tikla
  #  - Radiology sayfasinin acildigini gör
  #  -Sayfayi Kapat"


  Scenario: TC_01>>US_027
    Given Go to patientUrl
    Then Enter Username,Passwort and Click Sign in
    Then Click on the Radiology button from the Dashboard
    Then See the Radiology page open
    And Closed the browser

    ####################################################################################################################
    ##    TC_02>>>US_027

    #"  - Browser Calistir
    #  - https://qa.heallifehospital.com/site/userlogin adresini gir
    #  - Username ve Passwort gir
    #  -Sign in Butonunu tikla
    #  - Dashboarddan Radiology butonuna tikla
    #  - Radiology Test Reports Listte sayfasinda (Bill No, Case ID, Reporting Date, Reference Doctor,
    #    Note,Amount($), Paid Amount($). Balance Amount($), Action) basliklarinin görünür oldugunu tespit et
    #  -Sayfayi Kapat"

  #"  - Run Browser
  #  - Enter https://qa.heallifehospital.com/site/userlogin
  #  - Enter Username and Passwort
  #  - Click the Sign in Button
  #  - Click on the Radiology button from the Dashboard
  #  - On the Radiology Test Reports List page (Bill No, Case ID, Reporting Date, Reference Doctor,
  #    Note,Amount($), Paid Amount($). Detect if Balance Amount($), Action) headers are visible
  #  - Close Page"


  Scenario: TC_02>>US_027
    Given Go to patientUrl
    Then Enter Username,Passwort and Click Sign in
    Then Click on the Radiology button from the Dashboard
    Then On the Radiology Test Reports List page (Bill No, Case ID,..) are visible
    And Closed the browser


    ###########################################TC_03>>>US_027###########################################################
  #"  - Browser Calistir
  #  - https://qa.heallifehospital.com/site/userlogin adresini gir
  #  - Username ve Passwort gir
  #  - Sign in Butonunu tikla
  #  - Dashboarddan Radiology butonuna tikla
  #  - Search box kutusunu test et
  #  - Sayfayi kapat"
  #"  - Run Browser
  #  - Enter https://qa.heallifehospital.com/site/userlogin
  #  - Enter Username and Passwort
  #  - Click the Sign in Button
  #  - Click on the Radiology button from the Dashboard
  #  - Test the Search box
  #  - Close the page"
  Scenario: TC_03>>US_027
    Given Go to patientUrl
    Then  Enter Username,Passwort and Click Sign in
    Then Click on the Radiology button from the Dashboard
    Then Test that Searchtext Box is Visible
    And Closed the browser

    ###########################################TC_4>>US_027#############################################################
  #"  - Run Browser
  #  - Enter https://qa.heallifehospital.com/site/userlogin
  #  - Enter Username and Passwort
  #  - Click the Sign in Button
  #  - Click on the Radiology button from the Dashboard
  #  - On the Radiology Test Reports List page (Bill No, Case ID, Reporting Date,
  #    Reference Doctor,Note, Amount($),Paid Amount($). Balance Amount($), Action)
  #    test that your titles are sorting
  #  - Close Page"
#"  - Browser Calistir
#  - https://qa.heallifehospital.com/site/userlogin adresini gir
#  - Username ve Passwort gir
#  - Sign in Butonunu tikla
#  - Dashboarddan Radiology butonuna tikla
#  - Radiology Test Reports Listte sayfasinda(Bill No,Case ID,Reporting Date,
#    Reference Doctor,Note, Amount($),Paid Amount($). Balance Amount($), Action)
#    basliklarinin siralama yaptigini test et
#  - Sayfayi Kapat  "
  Scenario: TC_04>>>US_027
    Given Go to patientUrl
    Then  Enter Username,Passwort and Click Sign in
    Then Click on the Radiology button from the Dashboard
    Then On the Radiology Test Reports List page (Bill No, Case ID,..)test that  titles are sorting
    And Closed the browser



