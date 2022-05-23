package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends PageBase{
    public ProfilePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='account_menu_button_1']/android.view.ViewGroup/android.widget.Button")
    MobileElement submit;

    public void setSubmit()
    {
        click(submit);
    }
}
