Feature: Hepsiburada all  scenario

  @Android
  Scenario: Android login ve sepet
    When  Açılan uygulamanın "hepsiburada" olduğu kontrol edilir
    When  Anasayfada yeralan profil iconuna tiklanir
    When Profile page de giris butonuna tiklanir
    When  "pacacierdogan@gmail.com" email bilgisi girilir
    Then UserName pagedeki giris butonuna tiklanir
    When "erdo241907" password bilgisi girilir
    Then Password pagedeki giris butonuna tiklanir
    When "Keyifli alışverişler dileriz." bilgisi görülür
    Then Tamam butonuna tiklanir
    When Account pagede dismiss butonuna tiklanir
    When HomePagede searchtextboxa tiklanir
    When Searchpage de "laptop" ürünü aratilir
    Then listelenen ilk eleman secilir


