package Practice_folder.ApiTesting;

import Practice_folder.Base_urls.JsonPlaceHolderBaseurl;
import groovy.json.JsonToken;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

public class Get03 extends JsonPlaceHolderBaseurl {

    /*
        Given
	   	    https://jsonplaceholder.typicode.com/todos
		When
			 I send GET Request to the URL
		Then
			 1)Status code is 200
			 2)Print all ids greater than 190 on the console
			   Assert that there are 10 ids greater than 190
			 3)Print all userIds less than 5 on the console
			   Assert that maximum userId less than 5 is 4
			 4)Print all titles whose ids are less than 5
			   Assert that "delectus aut autem" is one of the titles whose id is less than 5
     */
    @Test
    public void get03() {
        spec.pathParam("first", "todos");
        Response response = given().spec(spec).when().get("/{first}");
        JsonPath json = response.jsonPath();
        //  response.prettyPrint();
        List<Object> userList = json.getList("findAll{it.id<10}");
        //  System.out.println(userList);
        for (Object w :
                userList) {
            System.out.println(w);
        }
        List<String> titleList = json.getList("findAll{it.id<10}.title");
        for (String w : titleList)
            System.out.println(w);

        titleList.stream().anyMatch(t -> t.equals("et porro tempora"));
        System.out.println(titleList.stream().anyMatch(t -> t.equals("et porro tempora")));

        System.out.println(titleList.contains("et porro tempora"));


        List<Integer> userIdList = json.getList("findAll{it.id<5}.userId");
        System.out.println(userIdList);


    }
}
