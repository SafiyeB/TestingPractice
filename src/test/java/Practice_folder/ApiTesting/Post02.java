package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.JsonPlaceHolderBaseurl;
import Practice_folder.TestData.JsonPlaceHolderTestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Post02 extends JsonPlaceHolderBaseurl {
/*
        Given
            https://jsonplaceholder.typicode.com/todos
            {
            "userId": 55,
            "title": "Tidy your room",
            "completed": false
            }
        When
            I send POST Request to the Url
        Then
            Status code is 201
        And
            response body is like {
                                    "userId": 55,
                                    "title": "Tidy your room",
                                    "completed": false,
                                    "id": 201
                                    }
     */
@Test
    public void post02(){

    spec.pathParam("first", "todos");

    JsonPlaceHolderTestData expectedData = new JsonPlaceHolderTestData();

    Map<String, Object> expectedDataMap = expectedData.expectedDataSetUpWithAllKeys(66,"Tidy your room",false);

    Response response = given().
            spec(spec).
            auth().
            basic("admin","1234").
            contentType(ContentType.JSON).
            body(expectedDataMap).
            when().
            post("/{first}");

    response.prettyPrint();

    Map<String,Object> actualData = response.as(HashMap.class);

    Assert.assertEquals(expectedDataMap.get("userId"),actualData.get("userId"));
}

}
