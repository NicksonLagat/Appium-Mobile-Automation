package Sample_Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_Test {

    // driver variable
    public static AppiumDriver<MobileElement>driver;
    public static DesiredCapabilities cap;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        cap = new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9.0");
        cap.setCapability("deviceName","emulator-5554 ");
        //cap.setCapability("app","C:/DummyApk/ApiDemos-debug.apk");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("appPackage","io.appium.android.apis");
        cap.setCapability("appActivity",".ApiDemos");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        Thread.sleep(200);



        driver.quit();
    }
}
