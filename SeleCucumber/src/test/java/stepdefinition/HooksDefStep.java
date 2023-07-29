package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDefStep {

	@Given("^Super heros meet the suoerman after the wake up$")
	public void super_heros_meet_the_suoerman_after_the_wake_up() throws Throwable {
	    System.out.println("Super heros meet the suoerman after the wake up");
	}

	@When("^batman uses the power box at larger lab with wonderwoman,flash,aquaman$")
	public void batman_uses_the_power_box_at_larger_lab_with_wonderwoman_flash_aquaman() throws Throwable {
	   System.out.println("batman uses the power box at larger lab with wonderwoman,flash,aquaman");
	}

	@Then("^Super man beat the all the suoer heroes except batman$")
	public void super_man_beat_the_all_the_suoer_heroes_except_batman() throws Throwable {
	   System.out.println("Super man beat the all the suoer heroes except batman");
	}
}
