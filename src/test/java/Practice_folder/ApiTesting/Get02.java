package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.HerOkuAppBaseurl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get02 extends HerOkuAppBaseurl {
/*
        Given
            https://restful-booker.herokuapp.com/booking/1001
        When
            User send a GET Request to the url
        Then
            HTTP Status code should be 404
        And
            Status Line should be HTTP/1.1 404 Not Found
        And
            Response body contains "Not Found"
        And
            Response body does not contain "TechProEd"
        And
            Server is "Cowboy"
     */
@Test
    public void get02(){
    spec.pathParams("first","booking","second","1001");

    Response response=given().spec(spec).when().get("/{first}/{second}");
    response.prettyPrint();

   Assert.assertTrue(response.asString().contains("Not Found"));

   // System.out.println(response.asString());

    Assert.assertEquals("Cowboy",response.getHeader("Server"));

}

}
