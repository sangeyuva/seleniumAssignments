package assertions;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HashmapMultipleQueryparam {
	
	
	@Test
	public void getAllByMultipleQueryParam()
	{
		RestAssured.baseURI="https://dev230355.service-now.com/api/now/table";
		
		RestAssured.authentication=RestAssured.basic("admin","*7A4JKpb!Sxl");
		
		Map<String, String> query_parameters = new HashMap<String,String>();
		query_parameters.put("sysparm_fields","short_description,description,sys_id");
		query_parameters.put("sysparm_limit", "2");
		
		Response response = RestAssured.given().contentType("application/json")
		.queryParams(query_parameters)
		.when()
		.get("incident");
		response.then().assertThat().statusCode(Matchers.equalTo(200));
		
		
	}

}
