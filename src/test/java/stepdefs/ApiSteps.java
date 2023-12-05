package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiSteps {
    @Given("set api endpoint {string}")
    public void setApiEndpoint(String arg0) {
    }

    @And("User creates new user with request body {string},{string},{string},{string}")
    public void userCreatesNewUserWithRequestBody(String arg0, String arg1, String arg2, String arg3) {
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
