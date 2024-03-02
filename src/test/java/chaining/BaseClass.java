package chaining;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	
	public static String sys_id;
	public static String Incident_num;
	
	
//	public static Map<String, String> query_parameters;
	
	@BeforeMethod
	public void setUp()
	{
		
	RestAssured.baseURI = "https://dev230355.service-now.com/api/now/table";
	
	RestAssured.authentication = RestAssured.basic("admin","*7A4JKpb!Sxl" );
//	
//	Map<String, String> query_parameters = new HashMap<String,String>();
//	query_parameters.put("sysparm_fields","short_description,description,sys_id");
//	query_parameters.put("sysparm_limit", "2");
}
	
	
}

