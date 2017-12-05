package popupHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ejazah {
  public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.ejazah.com/");
		driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();		
		driver.findElement(By.xpath("//h4[contains(text(),'Things To Do')]")).click();
		
		driver.findElement(By.id("viator_location_search")).sendKeys("india");
		driver.findElement(By.xpath("//li[contains(text(),'Andaman and Nicobar Islands')]")).click();
		driver.findElement(By.xpath("//*[@id='TourFormSearch']/div/div/div[2]/a")).click();
		
		
   }
}
