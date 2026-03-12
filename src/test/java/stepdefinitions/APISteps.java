package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APISteps {

    Response response;

    @Given("User sends GET request to product API")
    public void sendRequest() {
        response = RestAssured.get("https://fakestoreapi.com/products");
    }

    @Then("API response status should be 200")
    public void verifyStatus() {
        System.out.println("API Status Code: " + response.getStatusCode());
    }
}