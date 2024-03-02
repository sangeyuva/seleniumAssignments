package week1.day1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetJiraIssuebyKey extends BaseJira {
// API chaining :  Create > update > get by key to check updated description > delete the issue 
	// > get by deleted jira ID
	@Test(dependsOnMethods = "week1.day1.UpdateJIra.updateJira")
	public void getByKey() {
		
	
		
	
		Response response = RestAssured.given().contentType("application/json")
				.queryParam("fields", "summary, description")
				.when().get("rest/api/2/issue/" + key);

		response.then()
		.assertThat().statusCode(Matchers.equalTo(200));
response.then().assertThat().body("fields.description", Matchers.equalTo("Changed the description"));

	}
}
