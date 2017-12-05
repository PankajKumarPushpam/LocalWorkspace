package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo2 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://js.foundation/about/donate");
		//Actions class Object
		Actions action=new Actions(driver);
		WebElement mouse = driver.findElement(By.id("menu-item-41"));
		action.moveToElement(mouse).build().perform();
		Thread.sleep(6000);
		mouse=driver.findElement(By.xpath(".//*[@id='menu-item-1158']/a"));
		action.moveToElement(mouse).click().build().perform();
		Thread.sleep(6000);
		mouse=driver.findElement(By.xpath(".//*[@id='menu-item-1162']/a"));
		Thread.sleep(6000);
		action.moveToElement(mouse).click().build().perform();
		
		
	}

}
