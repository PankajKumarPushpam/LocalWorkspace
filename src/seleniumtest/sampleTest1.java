package seleniumtest;

import org.testng.annotations.Test;

public class sampleTest1 {
   @Test
   public void Login() {
	   System.out.println("Login Succesfully");
   }
   @Test(dependsOnMethods= {"Login"})
   public void Search() {
	   System.out.println("Search Succesfully");
   }
   @Test(dependsOnMethods= {"Search"})
   public void Logout() {
	   System.out.println("Logout Succesfully");
   }
   
} 
