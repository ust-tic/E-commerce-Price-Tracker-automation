package amazon_pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import qa_Base.TestBase;

public class LoginPages extends TestBase {

	//PageFactory // OR
	
	@FindBy (xpath = "//*[@id='top-links']/ul/li[2]")
	 public WebElement User1;
	
	@FindBy (xpath =  "//a[contains(text(),'Login')]")
	public WebElement Ulogin;
	
	@FindBy (id="input-email")
	public WebElement Loginemail;
	
	@FindBy (id="input-password")
	public WebElement LoginPwd;
	
	@FindBy (xpath =  "//input[@type='submit']")
	public WebElement LoginBtn;
	

	//Initilizing elements
	
public LoginPages() {
		PageFactory.initElements(driver, this);
}	
	

	//Actions
	public String Uzer() {
		return driver.getTitle();
	}
	
	public String Uzer1() {
		
		User1.click();
		Ulogin.click();
		Loginemail.sendKeys(prop.getProperty("email"));
		LoginPwd.sendKeys(prop.getProperty("pwd"));
		LoginBtn.click();
		return driver.getCurrentUrl();
	}
}


