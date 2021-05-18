import org.testng.Assert;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test_GET {
	
	@Test
	void test_GET()
	{
		Response response = get("https://reqres.in/api/users/2");
		
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
	}
	

}
