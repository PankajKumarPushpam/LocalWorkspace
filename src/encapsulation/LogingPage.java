package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogingPage {
     private WebElement unTxBx;
     private WebElement pwTxBx;
     private WebElement checkBx;
     private WebElement loginBtn;
     
     public LogingPage(WebDriver driver){
    	 unTxBx=driver.findElement(By.id("username"));
    	 pwTxBx=driver.findElement(By.name("pwd"));
    	 checkBx=driver.findElement(By.id("keepLoggedInCheckBox"));
    	 loginBtn=driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
     }
     /*
     
     public void setUserName(String name){
    	 unTxBx.sendKeys(name);
     }
     public void setPassword(String pw){
    	 pwTxBx.sendKeys(pw);
     }
     public void clickOnCheckbtn(){
    	 checkBx.click();
     }
     public void clickOnLoginbtn(){
    	 loginBtn.click();
     }
     */
     
     
     public void loging(String un,String pw){
    	 unTxBx.sendKeys(un);
    	 pwTxBx.sendKeys(pw);
    	 loginBtn.click();
     }
     public void loginWithMeLoggedIn(String un,String pw){
    	 unTxBx.sendKeys(un);
    	 pwTxBx.sendKeys(pw);
    	 checkBx.click();
    	 loginBtn.click();
     }
   
}
