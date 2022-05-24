package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TabBarPage extends PageBase{
    public TabBarPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath ="//android.widget.FrameLayout[@content-desc='Listelerim']/android.widget.FrameLayout/android.widget.ImageView")
    MobileElement listelerimButton;

    public void setListelerim(){
        listelerimButton.click();
    }
}
