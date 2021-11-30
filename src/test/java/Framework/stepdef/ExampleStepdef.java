package Framework.stepdef;

import io.cucumber.java.en.*;

public class ExampleStepdef {

    @Given("print given")
    public void print_given() {
        System.out.println("given");
    }
    @When("print when")
    public void print_when() {
        System.out.println("when");

    }
    @Then("print then")
    public void print_then() {
        System.out.println("then");
    }

}
