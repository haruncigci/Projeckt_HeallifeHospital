#"  - Browseri Calistir
#  - https://qa.heallifehospital.com/ sitesine git
#  - Anasayfa Sliderda Insurance Plans boardinin oldugunu tespit et
#  - Anasayfa Sliderda Pediatric Services boardinin oldugunu tespit et
#  - Anasayfa Sliderda Lap Testing boardinin oldugunu tespit et
#  - Anasayfa Sliderda Opening Hours boardinin oldugunu tespit et
#  - Sayfayi Kapat"


#  - Go to https://qa.heallifehospital.com/
#  - Detect existing Insurance Plans board
#  - Detect if you have a Pediatric Services board
#  - Detect the presence of the Lap Testing board
#  - Detect you have an Opening Hours board
#  - Close Page"


Feature: US_004 As a user, I would like to have boards on the home page for easy access to hospital information.
  Scenario: TC_001 >> US_004
    Given Go to homeUrl
    Then Detect existing Insurance Plans board
    Then Detect existing Pediatric Services board
    Then Detect the presence of the Lab Testing board
    Then Detect existing Opening Hours board
    And Closse Browser


      #"  - Browseri Calistir
      #  - https://qa.heallifehospital.com/ sitesine git
      #  - Instrunce Plans boardinin altinda read more butonuna tikla , sayfayi gör, geri gel
      #  - Pediatric Services boardinin altinda read more butonuna tikla , sayfayi gör, geri gel
      #  - Lab Testing boardinin altinda read more butonuna tikla , sayfayi gör, geri gel
      #  - Sayfayi Kapat"

      #"  - Run Browser
      #  - Go to https://qa.heallifehospital.com/
      #  - Detect read more under Instrunce Plans board
      #  - Detect read more under Pediatric Services board
      #  - Detect read more under Lab Testing board
      #  - Close Page"

  Scenario: TC_002 >> US_004
    Given Go to homeUrl
    Then Detect read more under Insurance Plans board
    Then Detect read more under Pediatric Services board
    Then Detect read more under Lab Testing board
    And Closed the browser