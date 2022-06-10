package stepDefinitions;

import cucumber.api.java.en.Given;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^Navigate to landing page and login application$")
    public void navigate_to_landing_page_and_login_application() throws Throwable {
        System.out.println("Navigate to landing page and login application");
    }

    @When("^enter a valid credentials and login$")
    public void enter_a_valid_credentials_and_login() throws Throwable {
        System.out.println("enter a valid credentials and login");
    }

    @Then("^navigate to the homepage and see all the subtabs of home$")
    public void navigate_to_the_homepage_and_see_all_the_subtabs_of_home() throws Throwable {
        System.out.println("navigate to the homepage and see all the subtabs of home");
    }

}
