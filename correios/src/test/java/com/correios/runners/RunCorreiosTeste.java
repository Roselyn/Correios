package com.correios.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
@RunWith(Cucumber.class)
@CucumberOptions(
		    features = "src/test/resources/pesquisaCEP.feature",
	        glue = "com.correios.steps",
			plugin= "pretty"
			)
	
public class RunCorreiosTeste {
	
}
