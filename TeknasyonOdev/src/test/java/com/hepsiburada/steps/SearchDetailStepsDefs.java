package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.When;
import pages.PageBase;
import pages.SearchDetailPage;

public class SearchDetailStepsDefs extends BaseTest {

    SearchDetailPage searchDetailPage;
    int pageCount=2;
    @When("Urun Listesinde Ucuncu satir besinci eleman secilir")
    public void urunListesindeUcuncuSatirBesinciElemanSecilir() {
        searchDetailPage=new SearchDetailPage(driver);

        for(int i=0;i<pageCount;i++){
            searchDetailPage.setSelectProduct();
        }
        searchDetailPage.setFifthElement();


    }
}

