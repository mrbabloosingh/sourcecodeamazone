package com.project.step;
import com.project.androidsetup.androidsetup;
import com.project.po.homeAMZpo;import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;

public class searchproductStep extends androidsetup {
	
	@Step ("Search produc")
	public static void ClicTextName() {
		click("xpath",homeAMZpo.HOME_SEARCHTEXTFIELD);
		
	}
	
	@Step ("Search produc")
	public static void EnterproducName() {
	 enterText("xpath",homeAMZpo.HOME_SEARCHTEXTFIELD,"printers\\n");   

	  MobileElement listitem =(MobileElement)driver.findElement(
              MobileBy.AndroidUIAutomator(
                     "new UiScrollable(new UiSelector())."
                     + "scrollIntoView("+"new UiSelector()."
                             + "text(\"HP DeskJet 2131 All-in-One Inkjet Colour Printer\"));"));
      
      listitem.click();
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 

//	 MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
//				"new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
//				+ "new UiSelector().className(\"android.view.View\"), \"HP DeskJet 1112 Single Function Inkjet Colour Printer \")"));
//		
////Perform the action on the element
//element.click();

	}

	
	@Step ("Click on Product")
	public static void secrchandclick( ) {
	//click("xpath",homeAMZpo.SEARC_PRODUCCLICK);

	


	}
	
	




}
