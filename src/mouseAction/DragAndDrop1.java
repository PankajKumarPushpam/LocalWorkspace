package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
        Actions action=new Actions(driver);
        driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.id("draggable"));
    	WebElement drop=driver.findElement(By.id("droppable"));
    	
    	action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
        Thread.sleep(3000);
    	driver.quit();
	}

}
