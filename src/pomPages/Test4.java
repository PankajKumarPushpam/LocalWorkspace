package pomPages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
@Test
public void demoAssert() {
	Reporter.log("Step 1", true);
	Assert.assertEquals("abc", "xyz");  
	
	Reporter.log("Step 2", true);
	Assert.assertEquals("abc", "abc");
	
	Reporter.log("Step 3", true);
	Assert.assertEquals("abc", "abc");
	
	Reporter.log("Step 4", true);
	Assert.assertEquals("abc", "abc");
}
}
