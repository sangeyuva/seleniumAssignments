package assertions;

import java.io.File;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReadfromJson {
	@Test
	public void createIncidentFromJson()
	{
		RestAssured.baseURI = "https://dev230355.service-now.com/api/now/table";
		
		RestAssured.authentication = RestAssured.basic("admin", "*7A4JKpb!Sxl");
		
		File jsonfile = new File ("./src/test/resources/createIncident.json");
		
		RequestSpecification input = RestAssured.given().contentType("application/json")
		.when()
		.body(jsonfile);
		
		Response response = input.post("incident");
		response.then().assertThat().statusCode(Matchers.equalTo(200));
		Map<String, String> cookies = response.getCookies();
		for(String c1 : cookies.keySet())
		{
			String c2 = cookies.get(c1);
			System.out.println(c2);
		}
		response.then().assertThat().body("result.description", Matchers.containsString("services center"));
		response.then().assertThat().body("result.short_description", Matchers.equalTo("Laptop Services"));
		
	}

}
