package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginfacebook {
    WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void beforeTest(String browserName) {
		if(browserName.equalsIgnoreCase("firefox")) {
	  		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	  		driver=new FirefoxDriver();
	  	}
	  	else if(browserName.equalsIgnoreCase("chrome")) {
	  		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  		driver=new ChromeDriver();
	  	}
	 	driver.manage().window().maximize();
	  	driver.get("https://www.facebook.com/login/");
	  	System.out.println(driver.getTitle());
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	@Test
	public void Login() {
		
		driver.findElement(By.id("email")).sendKeys("pffnyefxgymail.com");
		driver.findElement(By.id("pass")).sendKeys("nfygxffujnerfnj");
		driver.findElement(By.id("loginbutton")).click();;
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	  
		
	}