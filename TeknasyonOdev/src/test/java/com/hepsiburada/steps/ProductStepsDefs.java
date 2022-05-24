package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailPage;

public class ProductStepsDefs extends BaseTest {

    ProductDetailPage productDetailPage;
    @When("Favorite iconuna tiklanir")
    public void favoriteIconunaTiklanir() {
        productDetailPage =new ProductDetailPage(driver);
        productDetailPage.setFavoriteIcon();
        productDetailPage.setProductName();
        productDetailPage.setProductPrice();
    }

    @Then("Urun listeleme sayfasina geri donulur")
    public void urunListelemeSayfasinaGeriDonulur() {
        productDetailPage.setBackbutton();
    }
}
