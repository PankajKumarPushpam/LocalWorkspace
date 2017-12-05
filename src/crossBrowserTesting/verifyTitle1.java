package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifyTitle1 {

  WebDriver driver;
  
  
  @Test
  @Parameters("browser")
  public void verifypageTitle(String browserName) {    	
  	if(browserName.equalsIgnoreCase("firefox")) {
  		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
  		driver=new FirefoxDriver();
  	}
  	else if(browserName.equalsIgnoreCase("chrome")) {
  		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  		driver=new ChromeDriver();
  	}
 	driver.manage().window().maximize();
  	driver.get("http://www.learn-automation.com/");
  	System.out.println(driver.getTitle());
  	
  	driver.quit();
  }
  
	
}