package crossBrowserTesting1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class scriptCrossBrowser {
	public static final String USERNAME="pkpushpam1996";
	public static final String ACCESS_KEY="b3110220-c961-42be-a4dc-ac0e8271d54a";
	
	public static final String URL="http://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:80/wd/hub";
	
	public static void main(String[] args) throws Exception {
		
		//String URL="http://www.seleniumhq.org/";
		
		//String NODE="http://192.168.1.23:4444/wd/hub";
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setCapability("platform", "window 10");
		cap.setCapability("version", "61.0.3163.100");
		//WebDriver driver=new RemoteWebDriver(new URL(URL),cap);
		//driver.navigate().to("http://www.seleniumhq.org/");
		//WebDriver driver=new RemoteWebDriver(new URL(NODE),cap);
		//driver.navigate().to(URL);
		
		//Thread.sleep(5000);
		//driver.quit();
	}

}
