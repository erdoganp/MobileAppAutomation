package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserNamePage;

public class UserNameStepsDefs extends BaseTest {

    UserNamePage userNamePage;

    @When("{string} email bilgisi girilir")
    public void setTheEmail(String email) {

        userNamePage =new UserNamePage(driver);
        userNamePage.setEmailText(email);
    }

    @Then("UserName pagedeki giris butonuna tiklanir")
    public void setTheEnterButton() {

        userNamePage.setSubmit();
    }
}
