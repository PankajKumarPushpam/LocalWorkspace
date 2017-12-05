package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTest {
   @Test
   public void verifyTitle() {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http:/www.gmail.com");
	   String actual=driver.getTitle();
	   Assert.assertEquals(actual, "Gmail");
   }
}
