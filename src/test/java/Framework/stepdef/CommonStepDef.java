package Framework.stepdef;

import Framework.utilities.Driver;
import io.cucumber.java.en.*;

public class CommonStepDef {
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

}
