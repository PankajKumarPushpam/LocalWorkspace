package popupHandling;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class windowExample {
     public static WebDriver driver;
     
     
     @Test
     public void closeAllwindowExceptMainwindow() {
    	 driver=new ChromeDriver();
    	 
    	 driver.get("https://www.naukri.com/");
    	 driver.manage().window().maximize();
    	 
    	 // To get the main window handle
 		String windowTitle= getCurrentWindowTitle();
 		String mainWindow = getMainWindowHandle(driver);
 		Assert.assertTrue(closeAllOtherWindows(mainWindow));
 		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
 	}
 		
 	public String getMainWindowHandle(WebDriver driver) {
 		return driver.getWindowHandle();
 	}

 	public String getCurrentWindowTitle() {
 		String windowTitle = driver.getTitle();
 		return windowTitle;
 	}
 	
 	//To close all the other windows except the main window.
 	public static boolean closeAllOtherWindows(String openWindowHandle) {
 		Set<String> allWindowHandles = driver.getWindowHandles();
 		for (String currentWindowHandle : allWindowHandles) {
 			if (!currentWindowHandle.equals(openWindowHandle)) {
 				driver.switchTo().window(currentWindowHandle);
 				driver.close();
 			}
 		}
 		
 		driver.switchTo().window(openWindowHandle);
 		if (driver.getWindowHandles().size() == 1)
 			return true;
 		else
 			return false;
 	}
 }