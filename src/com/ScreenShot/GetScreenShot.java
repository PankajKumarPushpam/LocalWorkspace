package com.ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenShot extends MainTest{
      public static String capture(String screenShotName) throws Exception{
    	  TakesScreenshot ts=(TakesScreenshot) driver;
    	  File source=ts.getScreenshotAs(OutputType.FILE);
    	  String dest=System.getProperty("user.dir")+"F:\\SeleniumPractice2\\SeleniumPractice\\ErrorScreenShot\\"+screenShotName+".png";
    	  File destination=new File(dest);
    	  FileUtils.copyFile(source, destination);
		return screenShotName;
      }
}
