package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePO {
	WebDriverWait wait;
	public HomepagePO(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	}
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	public void logout(){
		logoutBtn.click();
	}

}
