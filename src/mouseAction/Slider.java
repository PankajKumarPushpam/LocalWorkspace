package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/slider/#colorpicker");
        Actions action=new Actions(driver);
        driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.xpath("//div[@id='red']/span"));
        Thread.sleep(3000);
    	action.clickAndHold(drag).moveByOffset(-100, 0).release(drag).build().perform();
    	action.clickAndHold(drag).moveByOffset(-100, 0);
    	Thread.sleep(3000);
        driver.quit();
	}

}
