package amazon_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import qa_Base.TestBase;

public class Products extends TestBase {

		@FindBy (xpath = "//a[@class ='dropdown-toggle']")
		WebElement Laptop;
		@FindBy (xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")
		WebElement seeallLaptop;
		@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")
		WebElement selectProcuct;
		@FindBy (xpath = "//input[@type=\"text\"][@id='input-option225']")
		WebElement deliveryDate;
		@FindBy (xpath = "/input[@type='text'][@id='input-quantity']")
		WebElement quantity;
		@FindBy (xpath = "//button[@type=\"button\"][@id='button-cart']")
		WebElement addToCart;
		@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
		WebElement Message;
		@FindBy (xpath = "//table[@class=\"table table-striped\"]/tbody/tr/td[@class = \"text-left\"]")
		WebElement Cartvalue;
		
		
		public void productSelect() {
			Laptop.click();
			seeallLaptop.click();
			selectProcuct.click();
			deliveryDate.sendKeys("2025-04-22");
			quantity.sendKeys("1");
			addToCart.click();
			String xx = Message.getText(); //Success: You have added HP LP3065 to your shopping cart!
			String yy = Cartvalue.getText();//HP LP3065
		}
			
		
		
		

	}

