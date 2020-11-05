package amz.amz;

import org.testng.annotations.Test;

import com.project.feature.loginfeature;
import com.project.step.loginstep;




public class LoginTest extends loginfeature {

	@Test(description = "Successfully Login")
	public void TestvalideloginUser() {
		gotologinpage();
}
	
}
	
