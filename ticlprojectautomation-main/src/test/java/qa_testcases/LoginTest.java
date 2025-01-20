package qa_testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon_pages.LoginPages;
import qa_Base.TestBase;

public class LoginTest extends TestBase {
	LoginPages LoginPages;
	

public LoginTest() {
super();
}

	@BeforeMethod
public void setup(){
		initialization();
	LoginPages = new LoginPages();
	}
		
@Test(priority=1)
	public void loginPagesUzerTest() {
	String xyz = LoginPages.Uzer();
	Assert.assertEquals(xyz, "Your Store");
}
	
@Test(priority=2)

public void loginPagesUzer1Test() {
	String xyy = LoginPages.Uzer1();
	Assert.assertEquals(xyy, "https://tutorialsninja.com/demo/index.php?route=account/login");
}

@AfterMethod
public void tearDown() {
	System.out.println("succ");
driver.quit();
	}
	
	
}
