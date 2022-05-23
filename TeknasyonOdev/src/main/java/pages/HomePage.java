package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase{
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Hepsiburada Hızlı Market']")
    MobileElement hepsiBurada;

    public void setGetHepsiburadaText(String exepText){
        String hepsiburadaAttribute=getAttribute(hepsiBurada,"content-desc");
        assertContains(hepsiburadaAttribute,exepText);
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



}
