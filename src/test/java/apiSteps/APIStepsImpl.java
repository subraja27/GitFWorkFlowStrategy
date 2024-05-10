package apiSteps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIStepsImpl {
	public Response response;
	
	@Given("Setup the endpoint")
	public void setUpEndPoint() {
		RestAssured.baseURI="http://universities.hipolabs.com/search?country=South+Africa";

	}
	
	@When("Place the getrequest")
	public void placeTherequest() {
		response = RestAssured.get();

	}
	
	@Then("Get the price of state province and verify")
	public void verifyOutput() {
		JsonPath jsonPath = response.jsonPath();
		List<Object> univList = jsonPath.getList("state-province");
		List<Object> nameList = jsonPath.getList("name");
		for (int i = 0; i < nameList.size(); i++) {
			Object  name = nameList.get(i);
			if (name.equals("University of Witwatersrand")) {
				System.out.println(univList.get(i));
			}
			
		}
		
	}

}
