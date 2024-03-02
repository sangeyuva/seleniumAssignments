package week1.day1;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

// Delete the jira issue and then do get request with deleted jira ID and validate the error messages

public class GetJiraIssueByID extends BaseJira {
	
	@Test(dependsOnMethods = "week1.day1.DeleteJira.deleteJira")
	public void getByID()
	{
		
		Response response = RestAssured.given().contentType("application/json")
				.queryParam("fields", "summary, description")
				.when().get("rest/api/2/issue/" + issue_id);

//.assertThat().statusCode(Matchers.equalTo(404));

// line 22 - its for chaining of API flow 
int statusCode = response.getStatusCode();
Assert.assertEquals(statusCode, HttpStatus.SC_NOT_FOUND);

String value1 = response.jsonPath().getString("errorMessages");
//JsonPath j = new JsonPath(response.asString());
//int size = j.getInt("errorMessages.size()");
//System.out.println(size);

//System.out.println(value1);
Assert.assertEquals(value1, "[Issue does not exist or you do not have permission to see it.]");


//response.then().assertThat().body(equals("[Issue does not exist or you do not have permission to see it.]"));
//response.then().assertThat().onFailMessage("[Issssue does not exist or you do not have permission to see it.]");
response.then().assertThat().statusLine("HTTP/1.1 404 Not Found");
//response.then().assertThat().body("employees.employee.sex", equals(89));
response.prettyPrint();	
	}

}
