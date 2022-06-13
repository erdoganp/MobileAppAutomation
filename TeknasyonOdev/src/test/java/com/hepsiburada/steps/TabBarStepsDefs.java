package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.When;
import pages.TabBarPage;

public class TabBarStepsDefs extends BaseTest {
    TabBarPage tabBarPage;
    @When("Tabbar alanindaki listelirim itemina tiklanir")
    public void setTheMyList() {
        tabBarPage =new TabBarPage(driver);
        tabBarPage.setListelerim();
    }
}
