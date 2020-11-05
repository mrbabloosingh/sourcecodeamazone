package com.project.androidsetup;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;


public class androidsetup {
	
	public static AppiumDriver<MobileElement> driver= null;
	
   @BeforeSuite
	public static void getdriver () {
	
		DesiredCapabilities caps = new DesiredCapabilities ();
		caps.setCapability("deviceName", "MOTO C");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		caps.setCapability("noReset", "true");
		caps.setCapability("fullReset", "false");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
	
	
	@Step("Getting value by {type} on {selector}}")
	public static String getText(String type, String selector) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (type.equals("xpath")) {
			return driver.findElement(By.xpath(selector)).getText();
		} else if (type.equals("id")) {
			return driver.findElement(By.id(selector)).getText();
		}else if (type.equals("class")) {
		 return driver.findElement(By.id(selector)).getText();
		} else if (type.equals("AccessibilityId")) {
			return driver.findElementByAccessibilityId(selector).getText();
		}
		else
			return null;
	}
	
	@Step("Clicking by {type} on {selector}}")
	public static void click(String type, String selector) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (type.equals("xpath")) {
			driver.findElement(By.xpath(selector)).click();
		} else if (type.equals("id")) {
			driver.findElement(By.id(selector)).click();
		} else if (type.equals("AccessibilityId")) {
			driver.findElementByAccessibilityId(selector).click();
		}
	}
	@Step("Enter by {type} on {selector}}")
	public static void enterText(String type, String selector, String keysToSend) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (type.equals("xpath")) {
			driver.findElement(By.xpath(selector)).sendKeys(keysToSend);
		} else if (type.equals("id")) {
			driver.findElement(By.id(selector)).sendKeys(keysToSend);
		} else if (type.equals("AccessibilityId")) {
			driver.findElementByAccessibilityId(selector).sendKeys(keysToSend);
		}
	}
	

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
