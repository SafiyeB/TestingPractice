package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.JsonPlaceHolderBaseurl;
import Practice_folder.TestData.JsonPlaceHolderTestData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.Map;

public class Patch01 extends JsonPlaceHolderBaseurl {

    /*
        Given
	        https://jsonplaceholder.typicode.com/todos/198
	        {

                "title": "Wash the dishes",

            }
        When
	 		I send PATCH Request to the Url
	    Then
	   	   Status code is 200
	   	   And response body is like   {
									    "userId": 10,
									    "title": "Wash the dishes",
									    "completed": true,
									    "id" :198
									   }
     */

    @Test
    public void patch01() {

        spec.pathParams("first", "todos", "second", 198);

        JsonPlaceHolderTestData requestBody = new JsonPlaceHolderTestData();

        Map<String,Object> requestBodyMap = requestBody.expectedDataSetUpWithMissingKeys(null,"Wash the dishes",null);
        Response response = RestAssured.given().spec(spec).contentType(ContentType.JSON).
                body(requestBodyMap).when().patch("/{first}/{second}");

        response.prettyPrint();

    }
}
