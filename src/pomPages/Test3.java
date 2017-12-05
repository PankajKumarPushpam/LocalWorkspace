package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	WebDriverWait wait;
	 @BeforeMethod
	    public void login() {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
			driver.manage().window().maximize();
            wait=new WebDriverWait(driver, 10);
	    }	 
	 @Test
	 public void validLogin() {
		 driver.get("https://online.actitime.com/ppushpam/login.do");
		 LoginpagePO login=new LoginpagePO(driver);
		 login.login("pkpushpam1996", "pankaj12345");
		 wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		 String actual=driver.getTitle();
		 String expected="actiTIME - Enter Time-Track";
		 Assert.assertEquals(actual, expected);
		 HomepagePO home=new HomepagePO(driver);
		 home.logout();
	 }
 
	     @AfterMethod
	     public void close() {
	    	driver.close(); 
   }
	     
   }
