package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import pages.ApiValidation;

public class ApiSteps extends ApiValidation {
   // bu class içinde Apivalidationı inherit yapıyorum

    @Given("user given api url {string}")
    public void userGivenApiUrl(String url) {
        //sistem environment için url i set yapiyoruz
        RestAssured.baseURI = url;
        System.out.println("user given api url " + url);
    }

    @Given("set api endpoint {string}")
    public void setApiEndpoint(String endpoint) {
        // api'n path ini set yapıyorum
        RestAssured.basePath= endpoint;
        // port yapmak istersem: "https://gorest.co.in:8080/public/v1/users"
        // RestAssured.port=8080;
        System.out.println("set api endpoint " + endpoint);
    }

    @And("user creates new user with request body {string},{string},{string},{string}")
    public void userCreatesNewUserWithRequestBody(String name, String gender, String email, String status) {
        System.out.println("User creates new user with request body " + name + gender + email + status);
    }

    @Then("validate the status code {int}")
    public void validateTheStatusCode(int arg0) {
    }

    @And("validate the userId is not null")
    public void validateTheUserIdIsNotNull() {
    }

    @And("validate the user name is {string}")
    public void validateTheUserNameIs(String arg0) {
    }

    @And("validate the user gender is {string}")
    public void validateTheUserGenderIs(String arg0) {
    }

    @And("validate the user email is {string}")
    public void validateTheUserEmailIs(String arg0) {
    }

    @And("validate the user status is {string}")
    public void validateTheUserStatusIs(String arg0) {
    }
}
