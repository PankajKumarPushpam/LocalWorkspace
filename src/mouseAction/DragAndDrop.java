package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get("http://jqueryui.com/draggable/");
	driver.get("http://jqueryui.com/droppable/");
	//Actions class Object
	Actions action=new Actions(driver);	
	driver.switchTo().frame(0);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Thread.sleep(3000);
	//action.doubleClick();
	action.contextClick();
	Thread.sleep(3000);
	action.dragAndDrop(drag, drop).perform();	
    //action.dragAndDropBy(drag, 20, 50).perform();
}
}
