package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStepsDefs extends BaseTest {

    HomePage homePage;

    @When("Açılan uygulamanın {string} olduğu kontrol edilir")
    public void açılanUygulamanınHepsiburadaOlduğuKontrolEdilir(String text) {
        homePage=new HomePage(driver);
        homePage.setGetHepsiburadaText("hepsiburada");
    }


    @When("Anasayfada yeralan profil iconuna tiklanir")
    public void anasayfadaYeralanProfilIconunaTiklanir() {

        homePage.setProfile();
    }

    @When("HomePagede searchtextboxa tiklanir")
    public void homepagedeSearchtextboxaTiklanir() {
        homePage.setSearchTextBar();
    }

    @When("Gelen sayfanin HomePage oldugu kontrol edilir")
    public void gelenSayfaninHomePageOlduguKontrolEdilir() {
        homePage.setGetHomeText("Home");
    }
}
