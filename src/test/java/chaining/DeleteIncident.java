package chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass {
	@Test(dependsOnMethods = "chaining.updateIncident.updateIncident")
	public void deleteIncident()
	{
		Response response = RestAssured.given().contentType("application/json")
		.when()
		.delete("incident/"+sys_id);
		response.then().assertThat().statusCode(Matchers.equalTo(204));
	}

}
