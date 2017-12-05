package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/sortable/#default");
        Actions action=new Actions(driver);
        driver.switchTo().frame(0);
        WebElement we1=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
        WebElement we2=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));
        action.clickAndHold(we2).click(we1).release().build().perform();
        
        WebElement we3=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[3]"));
        action.clickAndHold(we3).click(we2).release().build().perform();
        
        WebElement we4=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
        action.clickAndHold(we4).click(we3).release().build().perform();
        
        WebElement we5=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[5]"));
        action.clickAndHold(we5).click(we4).release().build().perform();
        
        WebElement we6=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6]"));
        action.clickAndHold(we6).click(we5).release().build().perform();
        
        WebElement we7=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
        action.clickAndHold(we7).click(we6).release().build().perform();
        
	}

}
