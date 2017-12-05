package seleniumtest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sampleTest2 {
	
	@BeforeClass
   public void Login() {
	   System.out.println("Login Succsessful");
   }
	@Test(priority=1)
	   public void Search() {
		   System.out.println("Search Succsessful");
	   }
	@Test(priority=2)
	   public void AdvanceSearch() {
		   System.out.println("AdvanceSearch Succsessful");
	   }
	@Test(priority=3)
	   public void ByProducts() {
		   System.out.println("BuyProducts Succsessful");
	   }
	@AfterClass
	   public void Logout() {
		   System.out.println("Logout Succsessful");
	}	
}
