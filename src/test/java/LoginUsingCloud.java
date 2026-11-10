import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class LoginUsingCloud {

    @Test
    public void testLoginUsingCloud() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", "sanjay_GW5D0j");
        caps.setCapability("browserstack.key", "zw8SqRqS1yVVytYA86hD");
        caps.setCapability("app", "bs://81b51ccddfae767e228c4e9c0c609349ef62e4f1");





        caps.setCapability("device", "Samsung Galaxy S22");
        caps.setCapability("os_version", "12.0");




        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "LaunchApp");

        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);
        androidDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        androidDriver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        androidDriver.findElement(By.id("com.theporter.android.customerapp:id/mobileNumberET")).click();
        androidDriver.findElement(By.id("com.theporter.android.customerapp:id/mobileNumberET")).sendKeys("98631");
        androidDriver.findElement(By.id("com.theporter.android.customerapp:id/loginBtn")).click();
        androidDriver.quit();
    }
}

// API Mocking in Such Cases

/*
automate --get repse---application predate cnew
        show someth

        has delhi but 3 plat
        bandlgre 7 order some count

        shombutton(new cutomer )
        shombutton(new cutomer )


//5 type of respone
1. database

        1234598

        2. api check

anothe

eskin

another*/
