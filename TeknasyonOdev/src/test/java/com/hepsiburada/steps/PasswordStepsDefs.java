package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PasswordPage;

public class PasswordStepsDefs extends BaseTest {

    PasswordPage passwordPage;
    PasswordPage passwordPage2;
    @When("{string} password bilgisi girilir")
    public void passwordBilgisiGirilir(String password) {

        passwordPage =new PasswordPage(driver);
        passwordPage.setPasswordText(password);
    }

    @Then("Password pagedeki giris butonuna tiklanir")
    public void passwordPagedekiGirisButonunaTiklanir() {
        passwordPage2 =new PasswordPage(driver);
        passwordPage2.setPassword();
    }
}
