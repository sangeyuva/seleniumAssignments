package chaining;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident extends BaseClass{
	@Test
	public void Createincident()
	{
		File jsonfile = new File ("./src/test/resources/createIncident.json");
		
		RequestSpecification input = RestAssured.given().contentType("application/json")
				.queryParam("sysparm_fields", "short_description,description,sys_id,number")
				.when()
				.body(jsonfile);
				
				Response response = input.post("incident");
				 sys_id = response.jsonPath().getString("result.sys_id");
				  Incident_num = response.jsonPath().getString("result.number");
				 
				 System.out.println(Incident_num);
				 
				response.then().assertThat().statusCode(Matchers.equalTo(201));
				response.then().assertThat().body("result.description", Matchers.containsString("services center"));
				response.then().assertThat().body("result.short_description", Matchers.equalTo("Laptop Services"));
			//	response.prettyPrint();
		
	}

}
