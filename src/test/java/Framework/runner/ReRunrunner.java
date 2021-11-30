package Framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"@ReRun/ReRun.txt"},
        glue = "Framework/stepdef",
        tags = "@smoketest",
        dryRun = false,

        plugin = {

        "html:src/test/resources/Report/html_report/index.html",
        "json:src/test/resources/Report/json_report/cucumber.json"

}

)
public class ReRunrunner {


}
