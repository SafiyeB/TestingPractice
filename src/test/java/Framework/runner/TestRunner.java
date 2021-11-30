package Framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "html:src/test/resources/Report/html_report/index.html",
                "json:src/test/resources/Report/json_report/cucumber.json",
                "rerun:ReRun/ReRun.txt"
        },

        features = "./src/test/resources/features",
        glue = "Framework/stepdef",
        tags = "@smoketest",
        dryRun = false

)
public class TestRunner {

}
