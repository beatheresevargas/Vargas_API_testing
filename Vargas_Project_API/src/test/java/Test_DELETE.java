import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_DELETE {


	@Test
	public void test_DELETE()
	{

		given().delete("https://reqres.in/api/users/2").then().statusCode(204);
	}

}
