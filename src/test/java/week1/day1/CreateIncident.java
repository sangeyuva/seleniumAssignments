package week1.day1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident {
	@Test
	public void Createincident()
	{
		RestAssured.baseURI = "https://dev230355.service-now.com/api/now/table";
		
		RestAssured.authentication = RestAssured.basic("admin","*7A4JKpb!Sxl" );
		
		RequestSpecification input = RestAssured.given().contentType("application/json")
		.when()
		.queryParam("sysparm_fields", "short_description,description,sys_id")
		.body("{\r\n"
				+ "    \"short_description\": \"Laptop Services\",\r\n"
				+ "    \"description\": \"Laptop Charger services center\"\r\n"
				+ "}");
		Response response = input.post("incident");
		String int1 = response.jsonPath().getString("result.sys_id");
		System.out.println(int1);
		
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		response.prettyPrint();
		
	}

}
