package popupHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("file:///F:/Html%20page/conf1.html");
		driver.findElement(By.xpath("//input[@ value='Click Me']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
        //alert.accept();
		alert.dismiss();
		Thread.sleep(3000);
        driver.quit();
	}

}
