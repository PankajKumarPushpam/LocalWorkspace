package RobotClass;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {
    public static void main(String[] args) throws Exception{
    	//Robot robot=new Robot();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("file:///F:/Html%20page/upload.html"); 	    
	    driver.findElement(By.id("1")).sendKeys("F:\\Important documents\\pankaj documents\\Resume Formate.doc");
	   
	    
	    /*
	    robot.setAutoDelay(2000);
	    
	    //path the file we want to paste
	    
	    StringSelection ssel=new StringSelection("F:\\Important documents\\pankaj documents\\Resume Formate.doc");
        
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);
	    
	    robot.setAutoDelay(1000);
	    
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);	    
	    
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    
	    robot.setAutoDelay(2000);
	    
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);    
	    */
    }
}
