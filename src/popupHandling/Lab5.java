package popupHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		String mainTitle = driver.getTitle();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
            if(title.equals(mainTitle)) {
            	
            }else {
            	driver.close();
            }
		}	
		//driver.quit();
	}

}
