package stepDef;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sample.Highlight;

public class Steps {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Hi");
	
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@Given("I want to write a step with name{int}")
	public void i_want_to_write_a_step_with_name(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	}
	
	
	@Given("verify the {string} column should contain the following records:")
	public void verify_the_column_should_contain_the_following_records(String string,DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.size());
		System.out.println(string);
		System.err.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		new Highlight().sample();
		
	}
}
