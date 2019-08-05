

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base 
{
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>  driver;

		
		File appDir = new File("APK");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementByxpath("//android.widget.TextView[@text = "Preference"]")
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Preference']").click();
	}

}
