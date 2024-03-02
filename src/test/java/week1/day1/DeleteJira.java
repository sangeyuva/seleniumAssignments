package week1.day1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteJira extends BaseJira {
	
	@Test(dependsOnMethods = "week1.day1.GetJiraIssuebyKey.getByKey")
	public void deleteJira()
	{
		Response response = RestAssured.given().contentType("application/json")
		.when()
		.delete("rest/api/2/issue/" +issue_id);
		response.then().assertThat().statusCode(Matchers.equalTo(204));
	}

}
