package week1.day1;



import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateJIra  extends BaseJira{
	@Test(dependsOnMethods = "week1.day1.CreateIssueinJira.createIssue")
	public void updateJira()
	{
//Response post_response = createJira();
		
		
		 RequestSpecification input = RestAssured.given().contentType("application/json")
			.queryParam("fields", "summary, description")
				.when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "\r\n"
						+ "        \"description\": \"Changed the description\"\r\n"
						+ "    }\r\n"
						+ "}");
Response update_response = input.put("rest/api/2/issue/" + issue_id);
update_response.then().assertThat().statusCode(Matchers.equalTo(204));


	}

}
