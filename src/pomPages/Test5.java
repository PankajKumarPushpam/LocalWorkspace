package pomPages;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test5 {
@Test
public void demoAssert() {
	SoftAssert s=new SoftAssert();
	
	Reporter.log("Step 1", true);
	s.assertEquals("abc", "xyz");   //comparing abc and xyz is not same that's why showing error 
	
	Reporter.log("Step 2", true);
	s.assertEquals("abc", "abc");
	
	Reporter.log("Step 3", true);
	s.assertEquals("abc", "abc");
	
	Reporter.log("Step 4", true);
	s.assertEquals("abc", "abc");
	
	s.assertAll();//assertAll method is used to disply the failed point
	
}
}