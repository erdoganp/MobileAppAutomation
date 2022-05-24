package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;

public class AccountPage extends PageBase{
    public AccountPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "android:id/message")
    MobileElement accountMessage;

    public void setWelcomeText(String welcomeMessage){
        String welcomeText=getAttribute(accountMessage,"text");
        assertContains(welcomeText,welcomeMessage);
    }

    @AndroidFindBy(id="android:id/button1")
    MobileElement ok;

    public void setOk(){
        click(ok);
    }

    @AndroidFindBy(id="com.pozitron.hepsiburada:id/ivToolbarBack")
    MobileElement dismiss;

    public void setDismiss(){
        click(dismiss);
    }




}
