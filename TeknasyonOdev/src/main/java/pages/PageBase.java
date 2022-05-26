package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class PageBase {
    AppiumDriver driver;
    public static final long WAIT=30;

    public PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver=appiumDriver;
    }

    public void waitForOperations(MobileElement element){

        WebDriverWait wait=new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(MobileElement element){
        waitForOperations(element);
        element.click();
    }

    public void sendText(MobileElement element,String text){
        waitForOperations(element);
        element.sendKeys(text);

    }

    public String getAttribute(MobileElement element,String attribute){
        waitForOperations(element);
        return element.getAttribute(attribute);
    }

    public void assertContains(String actualText,String exepText){

        Assert.assertTrue(actualText.contains(exepText));
    }
    public void assertEqual(String actualText,String exepText){
        Assert.assertEquals(actualText,exepText);
    }

    //scroolTheElements ile sayfa da kayma işlemi yapılır
    public void scroolTheElements(MobileElement startElement, MobileElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() /5 );
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 5);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 5);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 5);
        new TouchAction(driver)
                .press(point(startX, startY))
                .waitAction(waitOptions(ofMillis(5000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }
}
