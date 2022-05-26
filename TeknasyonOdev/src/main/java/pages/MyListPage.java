package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyListPage extends PageBase{
    public MyListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='predifined-box Beğendiklerim 1 ürün']")
    MobileElement myLikeButton;

    public void setMyList(){
        click(myLikeButton);
    }
}
