package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;

public class FavoritePage extends PageBase{
    public FavoritePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.View/android.view.View[3]")
    MobileElement getProductPrice;
    String getFavoritePrice;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.View/android.view.View[6]")

    MobileElement getProductName;
    String getFavoriteName;


    public String setGetProductPrice() {
        getFavoritePrice = getAttribute(getProductPrice, "text");
        System.out.println("Favorite Page Price : " + getFavoritePrice);
        return getFavoritePrice;

    }


    public String setGetProductName(){
        getFavoriteName=getAttribute(getProductName,"content-desc");
        System.out.println("Favorite Page Name : " + getFavoriteName);
        return getFavoriteName;

    }



    public void pricesEqualCheck() {
        super.assertEqual(getFavoritePrice, ProductDetailPage.price);
    }
    public void nameEqualCheck(){super.assertEqual(getFavoriteName,ProductDetailPage.name);}



}
