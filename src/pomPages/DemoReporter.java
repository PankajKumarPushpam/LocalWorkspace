package pomPages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoReporter {
    @Test(priority=1)
    public void Login() {
    	Reporter.log("Login SuccessFul");
    }
    @Test(priority=2)
    public void Search() {
    	Reporter.log("Search SuccessFul");
    }
    @Test(priority=3)
    public void AdvanceSearch() {
    	Reporter.log("AdvanceSearch SuccessFul");
    }
    @Test(priority=4)
    public void Logout() {
    	Reporter.log("Logout SuccessFul");
    }
}
