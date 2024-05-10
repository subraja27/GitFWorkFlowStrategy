package pages;

import org.openqa.selenium.support.PageFactory;

import base.PageObjects;
import io.cucumber.java.en.Given;

public class ShopPage extends PageObjects{
	
	public ShopPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@Given("Go to Shop on the Menu bar")
	public void go_to_shop_on_the_menu_bar() {
		shopEle.click();
	}
	
	@Given("Order a Seafood pizza")
	public void order_a_seafood_pizza() {
		pizzaEle.click();
		seaFoodPizzaEle.click();
	}

}
