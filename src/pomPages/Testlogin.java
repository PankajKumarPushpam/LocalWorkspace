package pomPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ppushpam/login.do");
		LoginpagePO login=new LoginpagePO(driver);
		login.login("pkpushpam1996", "pankaj12345");
		HomepagePO home=new HomepagePO(driver);
		home.logout();

	}

}
