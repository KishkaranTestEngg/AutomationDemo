package Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search 
{
	    @Given("^User is entering www.google.co.in$")
	    public void user_is_entering_wwwgooglecoin() throws Throwable {
	    System.out.println("Given-User is entering www.google.co.in$ ");
	        
	    }

	    @When("^User is typing search item as Herbalproducts$")
	    public void user_is_typing_search_item_as_herbalproducts() throws Throwable {
	    System.out.println("User is typing search item as Herbalproducts$");
	           
	    }

	    @Then("^User should see the search results$")
	    public void user_should_see_the_search_results() throws Throwable {
	    System.out.println("User should see the search results$");
	        
	    }

	    @And("^clicks the search button$")
	    public void clicks_the_search_button() throws Throwable {
	    System.out.println("clicks the search button$");    
	    }

	}
    

