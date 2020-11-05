package com.project.feature;

import com.project.step.loginstep;

import io.qameta.allure.Step;

public class loginfeature extends loginstep{
	@Step ("open login pages")
	public void gotologinpage() {
		clickonAllreadyAccount();
		clickonCreateAccount();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickonlogin();
		clickonEnterMobilenumber();
		clickonContinuebutton();
		clickonPasswordtextfield();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickonsubmitButton();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	} 

}
