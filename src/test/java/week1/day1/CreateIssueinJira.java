package week1.day1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssueinJira extends BaseJira {
@Test
	public void createIssue()
	{
		
		
		RequestSpecification input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"RS\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"Response time is slow\",\r\n"
				+ "        \"description\": \"Creating of an issue that response time is slow in REST API and its found by jenkins run\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}");
		
		Response response = input.post("rest/api/2/issue/");
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		issue_id = response.jsonPath().getString("id");
		
		 key = response.jsonPath().getString("key");
		
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		
		response.then().assertThat().body("id", Matchers.comparesEqualTo(issue_id));
		response.then().assertThat().body("key", Matchers.comparesEqualTo(key));
		response.prettyPrint();
		
		
		
		
	}

}
