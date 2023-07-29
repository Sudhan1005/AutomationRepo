package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Step_def_Hooks {

	@Before
	public void beforeWar(){
		System.out.println("Batman killed the super man");
	}
	@After
	public void afterWar() {
		System.out.println("Justice leage assamble");		
	}
}
