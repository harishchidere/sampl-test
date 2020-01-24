package sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="stepDef",
		features="./src/test/java/features/test.feature"
		)
public class Runer {

}
