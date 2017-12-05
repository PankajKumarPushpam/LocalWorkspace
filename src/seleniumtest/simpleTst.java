package seleniumtest;

import org.testng.annotations.Test;

public class simpleTst {
    @Test(priority=1,description="Login Verify",enabled=false)
    public void Login() {
    	System.out.println("Login Successful");
    }
    @Test(priority=2)
    public void Search() {
    	System.out.println("Search Successful");
    }
    @Test(priority=3)
    public void Logout() {
    	System.out.println("Logout Successful");
    }
}
