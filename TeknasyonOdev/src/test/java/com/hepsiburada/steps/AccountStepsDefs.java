package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;

public class AccountStepsDefs extends BaseTest {
    AccountPage accountPage;
    @When("{string} bilgisi görülür")
    public void getInformation(String welcome) {
        accountPage=new AccountPage(driver);
        accountPage.setWelcomeText(welcome);
    }

    @Then("Tamam butonuna tiklanir")
    public void setOkButton() {

        accountPage.setOk();

    }


    @When("Account pagede dismiss butonuna tiklanir")
    public void setDismissButton() {
        accountPage.setDismiss();
    }
}
