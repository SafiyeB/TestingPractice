package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.JsonPlaceHolderBaseurl;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Delete01 extends JsonPlaceHolderBaseurl {



    /*
        Given
	        https://jsonplaceholder.typicode.com/todos/198

        When
            send DELETE request
        THEN
            status code 200
            response body { }
	     */

    @Test

    public void delete01() {

        spec.pathParams("first", "todos", "second", 198);

        Response response = RestAssured.given().spec(spec).when().delete("/{first}/{second}");
        response.prettyPrint();

        Map<String,Object> actualMap = response.as(HashMap.class);
        Assert.assertTrue(actualMap.size()==0);

    }
}
