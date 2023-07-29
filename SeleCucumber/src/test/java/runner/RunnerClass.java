package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeatureFiles/HooksFeature",
        glue={"stepdefinition","hooks"}
        )
public class RunnerClass {

}
