package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginpagePO {
	WebDriverWait wait;
public LoginpagePO(WebDriver driver) {
	PageFactory.initElements(driver, this);
	wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("Login"));	
  }
@FindBy(id="username")
private WebElement unTxBx;

@FindBy(name="pwd")
private WebElement pwTxtBx;

@FindBy(xpath="//div[contains(text(),'Login')]")
private WebElement loginBtn;

public void login(String un,String pw){
	unTxBx.sendKeys(un);
	pwTxtBx.sendKeys(pw);
	loginBtn.click();
}
}
