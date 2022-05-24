package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchStepsDefs extends BaseTest {
    SearchPage searchPage;
    @When("Searchpage de {string} ürünü aratilir")
    public void searchpageDeÜrünüAratilir(String seekingProduct) {
        searchPage=new SearchPage(driver);
        searchPage.setSearchBarText(seekingProduct);
    }

    @Then("listelenen ilk eleman secilir")
    public void listelenenIlkElemanSecilir() {
        searchPage.setFirstValue();
    }
}
