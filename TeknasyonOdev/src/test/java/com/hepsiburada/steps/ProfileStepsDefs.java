package com.hepsiburada.steps;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.en.When;
import pages.ProfilePage;

public class ProfileStepsDefs extends BaseTest {

    ProfilePage profilePage;
    @When("Profile page de giris butonuna tiklanir")
    public void setProfilePageButton() {

        profilePage =new ProfilePage(driver);
        profilePage.setSubmit();
    }
}
