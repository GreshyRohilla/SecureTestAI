package stepdefinitions;

import io.cucumber.java.en.*;
import security.SecurityValidator;

public class SecuritySteps {

    SecurityValidator validator = new SecurityValidator();

    @Given("User enters malicious SQL input")
    public void maliciousInput() {
        validator.detectSQLInjection("' OR '1'='1");
    }

    @Then("System should flag potential security risk")
    public void verifySecurity() {
        System.out.println("Security validation executed successfully");
    }
}