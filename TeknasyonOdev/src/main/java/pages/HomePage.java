package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase{
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id="com.pozitron.hepsiburada:id/header_layout")
    MobileElement hepsiburadaText;
    public void setGetHepsiburadaText(String exepText){
        waitForOperations(hepsiburadaText);
        String hepsiburadaAttribute=getAttribute(hepsiburadaText,"package");
        assertContains(hepsiburadaAttribute,exepText);
    }
    @AndroidFindBy(id="com.pozitron.hepsiburada:id/toolbarHome")
    MobileElement homePageCheck;
    public void setGetHomeText(String exepText){
        waitForOperations(homePageCheck);
        String homePageAttribute=getAttribute(homePageCheck,"resource-id");
        assertContains(homePageAttribute,exepText);
    }

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/account_menu_button")
    MobileElement profile;

    public void setProfile(){
        click(profile);
    }

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/nav_graph_home")
    MobileElement homePageText;
    public void setGetHomePageText(String exepText){
        String homePageAttribute=getAttribute(homePageText,"content-desc");
        assertEqual(homePageAttribute,exepText);

    }
    @AndroidFindBy(id="com.pozitron.hepsiburada:id/textViewSearchBox")
    MobileElement searchTextBar;
    public void setSearchTextBar(){
        click(searchTextBar);
    }

}
