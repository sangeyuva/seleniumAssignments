package week1.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetIncident {
	@Test
	public void getAll()
	{
		RestAssured.baseURI="https://dev230355.service-now.com/api/now/table";
				
				RestAssured.authentication=RestAssured.basic("admin","*7A4JKpb!Sxl");
				
				Response response = RestAssured.given().contentType("application/json")
						.queryParam("sysparm_fields", "short_description,description,sys_id")
				.when()
				.get("incident");
				int statusCode = response.getStatusCode();
				System.out.println(statusCode);
				
				response.prettyPrint();
				
	}

}
