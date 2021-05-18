import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_PUT_PATCH {

	@Test
	public void test1_PUT()
	{
		JSONObject request = new JSONObject();
		
		request.put("name", "Jed");
		request.put("job", "Engineer");
		
		System.out.println(request.toJSONString());
		
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
				body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	}
	
	@Test
	public void test2_PATCH()
	{
JSONObject request = new JSONObject();
		
		request.put("name", "Jed");
		request.put("job", "Engineer");
		
		System.out.println(request.toJSONString());
		
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
				body(request.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	}
}
