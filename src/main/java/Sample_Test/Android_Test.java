package Sample_Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

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
        cap.setCapability("appPackage","com.google.android.dialer");
        cap.setCapability("appActivity",".DialtactsActivity");
        cap.setCapability("avd","Nexus_5_API_28");


        //driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        //Thread.sleep(200);

        //url to access the device
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //new android driver object
        AppiumDriver driver = new AppiumDriver(url,cap);
        String sessionId =  driver.getSessionId().toString();
        Thread.sleep(300);
        System.out.println(sessionId);


        driver.findElement(By.id("com.google.android.dialer:id/contacts_tab")).click();
        System.out.println("pass");
        driver.findElement(By.id("com.google.android.dialer:id/empty_list_view_action")).click();
        Thread.sleep(35000);
        driver.findElement(By.xpath("//android.widget.EditText[@text ='First name']")).sendKeys("Nick");
        Thread.sleep(3000);






        driver.quit();
    }
}
