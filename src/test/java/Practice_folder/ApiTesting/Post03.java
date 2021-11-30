package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.AgroMonitoringBaseurl;
import Practice_folder.TestData.AgroMonitoringTestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Post03 extends AgroMonitoringBaseurl {

    /*
       Given
		"http://api.agromonitoring.com/agro/1.0/polygons?appid=f4ffe3b2ef1fcb3600ab1d7fbc88c2f0"
            {
               "name":"Polygon Sample",
               "geo_json":{
                  "type":"Feature",
                  "properties":{},
                  "geometry":{
                     "type":"Polygon",
                     "coordinates":[
                        [
                           [-121.1958,37.6683],
                           [-121.1779,37.6687],
                           [-121.1773,37.6792],
                           [-121.1958,37.6792],
                           [-121.1958,37.6683]
                        ]
                     ]
                  }
               }
            }
	When
		 I send POST Request to the Url
	Then
		Assert Status Code (201)
		And Response Body should be like {
										    "id": "5fd8c383714b523b2ce1f154",
										    "geo_json": {
										        "geometry": {
										            "coordinates": [
										                [
										                    [
										                        -121.1958,
										                        37.6683
										                    ],
										                    [
										                        -121.1779,
										                        37.6687
										                    ],
										                    [
										                        -121.1773,
										                        37.6792
										                    ],
										                    [
										                        -121.1958,
										                        37.6792
										                    ],
										                    [
										                        -121.1958,
										                        37.6683
										                    ]
										                ]
										            ],
										            "type": "Polygon"
										        },
										        "type": "Feature",
										        "properties": {
										        }
										    },
										    "name": "Polygon Sample",
										    "center": [
										        -121.1867,
										        37.67385
										    ],
										    "area": 190.9484,
										    "user_id": "5fd8c02a3da20c000759e0f8",
										    "created_at": 1608041347
										}
     */

    @Test

    public void post03() {

        spec.pathParams("first", "agro", "second", 1.0, "third", "polygons").queryParam("appid", "f4ffe3b2ef1fcb3600ab1d7fbc88c2f0");

        AgroMonitoringTestData expectedData = new AgroMonitoringTestData();
        Map<String, Object> expectedDataMap = expectedData.requestBodySetUp();


        Response response = given().
                spec(spec).
                contentType(ContentType.JSON).
                body(expectedDataMap).
                when().
                post("/{first}/{second}/{third}");
        expectedDataMap.put("area", 190.9484);

Map<String,Object> actualData = response.as(HashMap.class);

        Assert.assertEquals(expectedDataMap.
                get("name"),actualData.get("name"));
        Assert.assertEquals(String.valueOf(expectedData.coordinates[0][1][0]),((Map)((Map)actualData.
                get("geo_json")).
                get("geometry")).
                get("coordinates").toString().substring(25,34));

        /* "id": "5fd8c383714b523b2ce1f154",
										    "geo_json": {
										        "geometry": {
										            "coordinates": [
										                [
										                    [
										                        -121.1958,
										                        37.6683
										                    ],
										                    [
										                        -121.1779,
										                        37.6687
										                    ],
										                    [
										                        -121.1773,
										                        37.6792
										                    ],
										                    [
										                        -121.1958,
										                        37.6792
										                    ],
										                    [
										                        -121.1958,
										                        37.6683
										                    ]
										                ]
										            ],
										            "type": "Polygon"
										        },
										        "type": "Feature",
										        "properties": {
										        }
										    },
										    "name": "Polygon Sample",
										    "center": [
										        -121.1867,
										        37.67385
										    ],
										    "area": 190.9484,
										    "user_id": "5fd8c02a3da20c000759e0f8",
										    "created_at": 1608041347
										}*/
    }
}
