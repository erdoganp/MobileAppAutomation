package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import pages.FavoritePage;

public class FavoriteStepsDefs extends BaseTest {

    FavoritePage favoritePage;
    @Then("Favorite page de name i kontrol et")
    public void favoritePageDeNameIKontrolEt() {
        favoritePage=new FavoritePage(driver);
        favoritePage.setGetProductName();
        favoritePage.nameEqualCheck();
    }

    @Then("Favorite page de price i kontrol et")
    public void favoritePageDePriceIKontrolEt() {
        favoritePage.setGetProductPrice();
        favoritePage.pricesEqualCheck();
    }
}
