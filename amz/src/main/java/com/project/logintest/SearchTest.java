package com.project.logintest;
import org.testng.annotations.Test;
import com.project.feature.SearchProductfeature;
public class SearchTest extends SearchProductfeature {
	@Test(description = "Searh Product")
	public void serchProduct() {
		productsearch();
		
		
	}
	

}
