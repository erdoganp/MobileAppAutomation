package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserNamePage extends PageBase{
    public UserNamePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "txtUserName")
    MobileElement eposta;

    public  void setEmailText(String email){
        sendText(eposta,email);
    }

    @AndroidFindBy(id = "btnLogin")
    MobileElement submit;
    public void setSubmit(){
        click(submit);
    }

}
