package com.project.logintest;

import org.testng.annotations.Test;

import com.project.feature.loginfeature;

public class logintest extends loginfeature {
	@Test(description = "Valid Login With Email and Password ")
	public void testvalidloginpages() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       gotologinpage();
		
	}
	
}

