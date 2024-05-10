package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.PageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPage extends PageObjects{
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	@When("Select Place your order")
	public void select_place_your_order() throws InterruptedException {
		Thread.sleep(3000);
		placeOrderEle.click();
	}
	
	@Then("Print the order number")
	public void print_the_order_number() {
		String actText = orderEle.getText();
		System.out.println(actText);
		int expNum = Integer.parseInt(actText);
		Assert.assertTrue(expNum<0,"The order number contains digits");

	}

}
