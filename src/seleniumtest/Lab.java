package seleniumtest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab {
    @BeforeTest
    public void Login() {
    	System.out.println("Login Successful");
    }
    @AfterTest
    public void Logout() {
    	System.out.println("Logout Successful");
    }
    @Test
    public void FundTransfer() {
    	System.out.println("FundTransfer Successful");
    }
    @Test
    public void BillPayment() {
    	System.out.println("BillPayment Successful");
    }
    @Test
    public void Rechage() {
    	System.out.println("Rechage Successful");
    }
}
