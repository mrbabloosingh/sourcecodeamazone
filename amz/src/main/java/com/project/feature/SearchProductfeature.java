package com.project.feature;
import com.project.step.searchproductStep;
import io.qameta.allure.Step;
public class SearchProductfeature extends searchproductStep{
	@Step("Searh Product")
 public static void productsearch() {
		ClicTextName();
		EnterproducName();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	 
	 
	 
 }
}
