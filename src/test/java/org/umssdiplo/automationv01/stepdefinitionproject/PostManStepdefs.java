package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Given("^POST postman endpoint is configured$")
    public void postPostmanEndpointIsConfigured() throws Throwable {
        response = HandleRequest.post();
        String result = response.then().statusCode(200).extract().path("data");
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
        assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("^the data path should be \"([^\"]*)\"$")
    public void theStatusCodeShouldBe(String responseString) throws Throwable {
        String result = response.then().statusCode(200).extract().path("data");
        assertEquals(result, responseString);
    }
}
