package Practice_folder.ApiTesting;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {

    /*
        Given
            https://restful-booker.herokuapp.com/booking/3
        When
            User send a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */
    @Test
    public void get01() {
        String url = " https://restful-booker.herokuapp.com/booking/3";

        //3)Type automation script to send GET Request and to get response
        Response response = given().when().get(url);
        response.prettyPrint();
        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

        System.out.println(response.getContentType());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());

    }
}
