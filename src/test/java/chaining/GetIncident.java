package chaining;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.hamcrest.collection.HasItemInArray;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetIncident extends BaseClass {
	@Test(dependsOnMethods = "chaining.CreateIncident.Createincident")
	public void getAll()
	{
		
		Map<String, String> query_parameters = new HashMap<String,String>();
	query_parameters.put("sysparm_fields","short_description,description,sys_id,number");
	//query_parameters.put("sysparm_limit", "2");
				
				Response response = RestAssured.given().contentType("application/json")
						.queryParams(query_parameters)
				.when()
				.get("incident");
				response.then().assertThat().statusCode(Matchers.equalTo(200));
				response.then().assertThat().body("result.number",Matchers.hasItem(Incident_num));
		response.prettyPrint();		
				
	}

}
