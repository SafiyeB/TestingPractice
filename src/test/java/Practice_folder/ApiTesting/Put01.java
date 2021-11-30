package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.JsonPlaceHolderBaseurl;
import Practice_folder.TestData.JsonPlaceHolderTestData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.Map;



public class Put01 extends JsonPlaceHolderBaseurl {

    /*
        Given
	        https://jsonplaceholder.typicode.com/todos/198
	        {
                "userId": 21,
                "title": "Wash the dishes",
                "completed": false
            }
        When
	 		I send PUT Request to the Url
	    Then
	   	   Status code is 200
	   	   And response body is like   {
									    "userId": 21,
									    "title": "Wash the dishes",
									    "completed": false
									   }
     */
@Test

    public void put01(){
    spec.pathParams("first","todos","second",198);

    JsonPlaceHolderTestData requestBody = new JsonPlaceHolderTestData();

    Map<String,Object> requestBodyMap = requestBody.expectedDataSetUpWithAllKeys(21,"Wash the dishes",false);
    Response response = RestAssured.given().spec(spec).contentType(ContentType.JSON).
            body(requestBodyMap).when().put("/{first}/{second}");

    response.prettyPrint();

}


}
