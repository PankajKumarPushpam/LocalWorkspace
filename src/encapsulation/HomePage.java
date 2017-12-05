package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
private WebElement logoutBtn;
public HomePage(WebDriver driver){
	logoutBtn=driver.findElement(By.id("logoutLink"));
}
public void clickOnLOgout(){
	logoutBtn.click();
}
}
