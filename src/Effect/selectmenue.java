package Effect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class selectmenue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/selectmenu/");
        Actions action=new Actions(driver);
        driver.switchTo().frame(0);
        WebElement element=driver.findElement(By.xpath(".//*[@id='speed-button']/span[1]"));
        Select sl=new Select(element);
        sl.selectByIndex(5);
        
        
	}

}
