package AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void fileUploadDemo() throws Exception{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("file:///F:/Html%20page/resumeUpload.html");
		driver.findElement(By.xpath("//input[@ id='1']")).click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("E:\\AutoIt\\fileupload.exe");
		
	}
}
