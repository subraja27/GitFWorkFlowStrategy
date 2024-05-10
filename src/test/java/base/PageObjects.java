package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects extends BaseClass{
	
	@FindBy(partialLinkText = "Proceed to checkout")
	public WebElement checkoutEle;
	
	@FindBy(id="place_order")
	public WebElement placeOrderEle;
	
	@FindBy(xpath ="//li[contains(text(),'Order')]/strong") 
	public WebElement orderEle;

	@FindBy(xpath="//span[text()='My account']") 
	public WebElement accountEle;
	
	@FindBy(id="username") 
	public WebElement uNameEle;
	
	@FindBy(id="password") 
	public WebElement pWordEle;
	
	@FindBy(name="login") 
	public WebElement loginEle;
	
	@FindBy(xpath="//span[text()='Shop']") 
	public WebElement shopEle;
	
	@FindBy(xpath="//h2[contains(text(),'Pizza')]") 
	public WebElement pizzaEle;
	
	@FindBy(xpath="//h2[contains(text(),'Seafood Pizza')]/following::a[1]") 
	public WebElement seaFoodPizzaEle;
	
	

}
