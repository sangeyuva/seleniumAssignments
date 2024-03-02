package steps;

import java.io.File;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class GetAllIncident {

public static Response response;
public static RequestSpecification input;

	@Given("the base URL")
	public void base_url()
	{
		
		RestAssured.baseURI="https://dev230355.service-now.com/api/now/table";
	}
	@And("Set the Auth")
		public void setAuth()
		{
		
				RestAssured.authentication=RestAssured.basic("admin","*7A4JKpb!Sxl");
		}
	@When("GET all incidents")
	public void getIncident()
	{
				
				 response = RestAssured.given().contentType("application/json")
						.queryParam("sysparm_fields", "short_description,description,sys_id")
				.when()
				.get("incident");
	}
	@Then("assert status code is {int}")
	public void validateResponseCode(int responseCode)
	{
				
				response.then().assertThat().statusCode(responseCode);
	}
	@When("create incident with String body {string}")
	public void createIncident(String body)
	{
		 input = RestAssured.given().contentType("application/json")
				.when()
//				.queryParam("sysparm_fields", "short_description,description,sys_id")
				.body(body);
		 
		 response = input.post("incident");
		
	}

	@When("create incident with json {string}")
	public void createIncidentUsingJsoon(String filename)
	{
		File file = new File("./src/main/java/resources/"+filename);
		input = RestAssured.given().contentType("application/json")
				.when()
//				.queryParam("sysparm_fields", "short_description,description,sys_id")
				.body(file);
		
	}
	
	
	


}


