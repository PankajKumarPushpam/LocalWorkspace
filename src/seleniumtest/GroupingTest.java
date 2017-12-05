package seleniumtest;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupingTest {
   @BeforeGroups(groups= {"sanity"})
   public void Login() {
	   System.out.println("Login Successful");
   }
   @AfterGroups
   public void Logout() {
	   System.out.println("Logout Successful");
   }
   @Test (groups= {"sanity"})
   public void fundTransfer() {
	   System.out.println("Fund Transfer Successful");
   }
   @Test (groups= {"sanity","regression"})
   public void BillPayment() {
	   System.out.println("BillPayment Successful");
   }
   @Test (groups= {"regression"})
   public void Reacharge() {
	   System.out.println("Reacharge Successful");
   }
   @Test (groups= {"regression"})
   public void CardPayment() {
	   System.out.println("CardPayment Successful");
   }
}
