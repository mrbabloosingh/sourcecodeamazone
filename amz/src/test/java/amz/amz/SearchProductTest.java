package amz.amz;

import org.testng.annotations.Test;

import com.project.feature.SearchProductfeature;

public class SearchProductTest  extends  SearchProductfeature{
	@Test(description = "Search Product in Add Cart")
	public void SearchProduct() {
		productsearch();
}
	
}


