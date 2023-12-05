package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiSteps {
    @Given("set api endpoint {string}")
    public void setApiEndpoint(String endpoint) {
        System.out.println("set api endpoint " + endpoint);
    }

    @And("User creates new user with request body {string},{string},{string},{string}")
    public void userCreatesNewUserWithRequestBody(String name, String gender, String email, String status) {
        System.out.println("User creates new user with request body " + name + gender + email + status);
    }

    @Then("validate the status code {int}")
    public void validateTheStatusCode(int statusCode) {
        System.out.println("validate the status code"+statusCode);
    }

    @And("validate the userId is not null")
    public void validateTheUserIdIsNotNull() {
        System.out.println("validate the userId is not null");
    }

    @And("validate the user name is {string}")
    public void validateTheUserNameIs(String name) {
    }

    @And("validate the user gender is {string}")
    public void validateTheUserGenderIs(String gender) {
    }

    @And("validate the user email is {string}")
    public void validateTheUserEmailIs(String email) {
    }

    @And("validate the user status is {string}")
    public void validateTheUserStatusIs(String status) {
    }
}
