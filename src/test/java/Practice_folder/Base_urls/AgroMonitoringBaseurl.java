package Practice_folder.Base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class AgroMonitoringBaseurl {

    //Create an object in RequestSpecification data type
    protected RequestSpecification spec;

    //If you use @Before annotation at the top of a method, it means the method will be executed before every test method
    @Before
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("http://api.agromonitoring.com").build();
    }
}
