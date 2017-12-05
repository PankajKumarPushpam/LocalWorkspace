package Effect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allcontent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		 WebElement all = driver.findElement(By.xpath(".//*[@id='sbse4']/div[2]"));
		
	}

}
