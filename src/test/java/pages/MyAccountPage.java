package pages;

import org.openqa.selenium.support.PageFactory;

import base.PageObjects;
import io.cucumber.java.en.Given;

public class MyAccountPage extends PageObjects{
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Given("Enter the username and password as {string} and {string}")
	public void enter_the_username_and_password_as_and(String uName, String pWord) {
		accountEle.click();
		uNameEle.click();
		pWordEle.click();
		loginEle.click();
	}

}
