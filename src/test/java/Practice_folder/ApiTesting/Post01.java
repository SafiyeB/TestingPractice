package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.HerOkuAppBaseurl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Post01 extends HerOkuAppBaseurl {

    /*
        Given
	        https://restful-booker.herokuapp.com/booking
	        {
                "firstname": "Selim",
                "lastname": "Ak",
                "totalprice": 11111,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2021-09-09",
                    "checkout": "2021-09-21"
                 }
              }
        When
	 		I send POST Request to the Url
	 	Then
	 		Status code is 200
	 		And response body should be like {
											    "bookingid": 11,
											    "booking": {
											        "firstname": "Selim",
											        "lastname": "Ak",
											        "totalprice": 11111,
											        "depositpaid": true,
											        "bookingdates": {
											            "checkin": "2020-09-09",
											            "checkout": "2020-09-21"
											        }
											    }
											 }
     */
    @Test
    public void post01() {
        spec.pathParam("first", "booking");
        Map<String, String> expectedBookingDates = new HashMap<>();
        expectedBookingDates.put("checkin","2020-09-09");
        expectedBookingDates.put("checkout","2020-09-21");

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("firstname", "Selim");
        expectedData.put("lastname", "Ak");
        expectedData.put("totalprice", 11111);
        expectedData.put("depositpaid", true);
        expectedData.put("bookingdates", expectedBookingDates);


        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}");
        response.prettyPrint();

        Map<String, Object> actualData = response.as(HashMap.class);

        Assert.assertEquals(expectedData.get("firstname"),((Map)actualData.get("booking")).get("firstname"));
        Assert.assertEquals(expectedData.get("lastname"),((Map)actualData.get("booking")).get("lastname"));
        Assert.assertEquals(expectedData.get("totalprice"),((Map)actualData.get("booking")).get("totalprice"));
        Assert.assertEquals(expectedData.get("depositpaid"),((Map)actualData.get("booking")).get("depositpaid"));

        Assert.assertEquals(expectedBookingDates.get("checkin"),((Map)((Map)actualData.get("booking")).get("bookingdates")).get("checkin"));

    }
}
