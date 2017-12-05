package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDemo {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//Actions class Object
		Actions builder=new Actions(driver);
		WebElement mouse=driver.findElement(By.xpath("(//span[contains(text(),'Electronics')])[1]"));
		builder.moveToElement(mouse).build().perform();
		Thread.sleep(3000);
		mouse=driver.findElement(By.xpath("(//span[contains(text(),'Mi')])[2]"));
		builder.moveToElement(mouse).click().build().perform();
		Thread.sleep(3000);
		mouse=driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/div/a/span"));
		builder.moveToElement(mouse).click().build().perform();




	}

}
