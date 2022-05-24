package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.When;
import pages.PageBase;
import pages.SearchDetailPage;

public class SearchDetailStepsDefs extends BaseTest {

    SearchDetailPage searchDetailPage;
    @When("Urun Listesinde Ucuncu satir besinci eleman secilir")
    public void urunListesindeUcuncuSatirBesinciElemanSecilir() {
        searchDetailPage=new SearchDetailPage(driver);
        searchDetailPage.setSelectProduct();
        searchDetailPage.setThirdElement();

        /*searchDetailPage.setSelectProduct2();
        searchDetailPage.setThirdElement();*/
    }
}
