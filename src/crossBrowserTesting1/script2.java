package crossBrowserTesting1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class script2 {
		public static void main(String[]  args) throws MalformedURLException, InterruptedException{
	 
	 		String URL = "http://www.seleniumhq.org/";
	 		String Node = "http://192.168.1.23:4444/wd/hub";
	 		
	 		DesiredCapabilities cap = DesiredCapabilities.firefox();
	 
	 		WebDriver driver = new RemoteWebDriver(new URL(Node), cap);
	 
	 		driver.navigate().to(URL);
	 		Thread.sleep(5000);
	 		driver.quit();
	 	}		
	}

