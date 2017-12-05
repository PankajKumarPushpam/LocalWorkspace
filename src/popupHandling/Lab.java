package popupHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		//hidden divisions popup
		driver.findElement(By.id("ico-cal")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("a_2017_10_23")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}
