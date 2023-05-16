#"  - Browseri Calistir
#  - https://qa.heallifehospital.com/ sitesine git
#  - Anasayfada Our Doctors basligi nin oldugunu tespit et
#  - Our Doctors da 6 Doktorun Fotograf , isim ve soyisim ve unvanlarinin oldugunu tespit et.
#  - Sayfayi Kapat"


 #"  - Run Browser
 #  - Go to https://qa.heallifehospital.com/
 #  - Detect the title Our Doctors on the homepage
 #  - Detect that 6 Doctors have Photographs, names and surnames and titles in Our Doctors.
 #  - Close Page"

  Feature: "It should be verified that the photo, name, surname and title of 6 doctors (Heidi Prather, Alexander C. Simotas, Kristina Marie Quirolgico,
    Christopher Lutz, oel M. Press, Dena Barsoum) are visible under the title ""Our Doctors"" on the main page."

  Scenario: TC_01 >> US_006
    Given Go to homeUrl
    Then Detect the title Our Doctors on the homepage
    Then Detect that ilk 3 Doctors have Photographs, names and surnames and titles in Our Doctors.
    Then Detect that son 3 Doctors have Photographs, names and surnames and titles in Our Doctors.
    And Closed the browser



