
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginApp extends BaseTest{

    @Test
    public void launchBrowser() throws InterruptedException {
        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        androidDriver.findElement(By.id("com.theporter.android.customerapp:id/mobileNumberET")).click();
        androidDriver.findElement(By.id("com.theporter.android.customerapp:id/mobileNumberET")).sendKeys("9811280631");
        androidDriver.findElement(By.id("com.theporter.android.customerapp:id/loginBtn")).click();

    }
}
