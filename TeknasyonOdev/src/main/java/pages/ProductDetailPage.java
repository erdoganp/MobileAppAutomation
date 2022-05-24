package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailPage extends PageBase{
    public ProductDetailPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    static String price;
    static String name;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/price")
    MobileElement productPrice;
    public String setProductPrice(){
        price=getAttribute(productPrice,"text");

        System.out.println("Product Page Price : " + price);
        return price;
    }

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/productName")
    MobileElement productName;
    public String setProductName(){
        name=getAttribute(productName,"text");

        System.out.println("Product page Name : " + name);
        return name;
    }


 //   @AndroidFindBy(id="com.pozitron.hepsiburada:id/product_detail_favourites")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='favoriye ekle']")
    MobileElement favoriteIcon;

    public void setFavoriteIcon(){
        favoriteIcon.click();
    }

   // @AndroidFindBy(id = "com.pozitron.hepsiburada:id/leftIcon")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Geri']")
    MobileElement backbutton;

    public void setBackbutton(){
        backbutton.click();
    }
}
