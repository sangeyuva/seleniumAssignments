package chaining;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateIncident extends BaseClass{
	
	@Test(dependsOnMethods = "chaining.CreateIncident.Createincident") // package name. classname.methodName
	public void updateIncident()
	{
		
				File update_jsonfile = new File ("./src/test/resources/updateIncident.json");
		RequestSpecification input = RestAssured.given().contentType("application/json")
				.queryParam("sysparm_fields", "short_description,description,sys_id")
		.when()
		
		.body(update_jsonfile);
		//int sys_id = 3d7ad01397100210d0b1b82de053af4c;
		System.out.println(sys_id);
		Response response = input.put("incident/" +sys_id);
		response.then().assertThat().statusCode(Matchers.equalTo(200));
		response.then().assertThat().body("result.short_description", Matchers.equalTo("Mobile watch Services"));
		response.then().assertThat().body("result.description", Matchers.containsString("sangya"));
		response.prettyPrint();
		
	}

}
