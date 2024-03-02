package week1.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateIncident {
	
	@Test
	public void updateIncident()
	{
RestAssured.baseURI = "https://dev230355.service-now.com/api/now/table";
		
		RestAssured.authentication = RestAssured.basic("admin","*7A4JKpb!Sxl" );
		
		RequestSpecification input = RestAssured.given().contentType("application/json")
		.when()
		.queryParam("sysparm_fields", "short_description,description,sys_id")
		.body("{\r\n"
				+ "    \"short_description\": \"Mobile watch Services\",\r\n"
				+ "    \"description\": \"Laptop Charger services center sangya\"\r\n"
				+ "}");
		//int sys_id = 3d7ad01397100210d0b1b82de053af4c;
		
		Response response = input.put("incident/3d7ad01397100210d0b1b82de053af4c");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		response.prettyPrint();
		
	}

}
