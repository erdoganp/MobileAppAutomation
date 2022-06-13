package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import pages.FavoritePage;

public class FavoriteStepsDefs extends BaseTest {

    FavoritePage favoritePage;
    @Then("Favorite page de name i kontrol et")
    public void verifyName() {
        favoritePage=new FavoritePage(driver);
        favoritePage.setGetProductName();
        favoritePage.nameEqualCheck();
    }

    @Then("Favorite page de price i kontrol et")
    public void verifyPrice() {
        favoritePage.setGetProductPrice();
        favoritePage.pricesEqualCheck();
    }
}
