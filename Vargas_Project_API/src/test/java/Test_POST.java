import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_POST {
	
	@Test
	public void test_POST()
	{
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Jackson");
		request.put("job", "Athlete");
		
		System.out.println(request.toJSONString());
		
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
				body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
		
	}

}
