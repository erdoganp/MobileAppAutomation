package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.When;
import pages.MyListPage;

public class MyListStepsDefs extends BaseTest {
    MyListPage myListPage;
    @When("Listerimde begendiklerin kategorisine gidilir")
    public void navigateToLike() {

        myListPage=new MyListPage(driver);
        myListPage.setMyList();
    }
}
