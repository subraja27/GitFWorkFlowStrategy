package pages;

import org.openqa.selenium.support.PageFactory;

import base.PageObjects;
import io.cucumber.java.en.Given;

public class CartPage extends PageObjects{
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	

	
	@Given("Select Check out")
	public void select_check_out() {
		checkoutEle.click();
	}

}
