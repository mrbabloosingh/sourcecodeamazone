package com.project.step;
import com.project.androidsetup.androidsetup;
import com.project.po.loginpo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
public class loginstep extends androidsetup  {
	
	@Step("Allready Account")	
	public static void clickonAllreadyAccount() {
		click ("id",loginpo.ALLREADY_ACCOIUN);
		
		
	}
		
	@Step("Create Account")	
	public static void clickonCreateAccount() {
		click ("xpath",loginpo.CREATE_ACCOUNT);
	
		
	}
	
	
	@Step(" Login")	
	public static void clickonlogin() {
   	MobileElement listitem =(MobileElement)driver.findElement(
	               MobileBy.AndroidUIAutomator(
	                      "new UiScrollable(new UiSelector())."
	                      + "scrollIntoView("+"new UiSelector()."
	                              + "text(\"Login. Already a customer?\"));"));
	       
	       listitem.click();	
	       //click ("id",loginpo.LOGIN);
	

	
	}
	
	@Step(" Enter Mobile number")	
	public static void clickonEnterMobilenumber() {
		enterText ("xpath",loginpo.MOBILE_NUMBERTEXTFIELD,"9986840240");
	}
	
	@Step(" Continue Button")	
	public static void clickonContinuebutton() {
		click ("xpath",loginpo.CONTINUE_BUTTON);
	}
	
	@Step("Password textfield")	
	public static void clickonPasswordtextfield() {
		enterText ("xpath",loginpo.PASSWORD_TEXFIELD,"39257615");
	}
	
	@Step("Submit")
	public static void ClickonsubmitButton() {
		click("xpath" ,loginpo.LOGIN_SUBMIT);
	}
	
	
	
		


}
