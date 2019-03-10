package com.junit5.samples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

//@Disabled
@RunWith(JUnitPlatform.class)
public class DisabledTest {

	@Test
	@Disabled
	public void thisTestHasBeenDisabled() {
		System.out.println("Disabled test");
	}
	
	@Test
	@Disabled
	public void disabledAnnotationCanBeAddedAtTheMethodLevelToo() {
		System.out.println("Method level annotation");
	}
	
	@Test
	@DisabledOnOs(OS.MAC) 
	public void executionConditionTest(){
		System.out.println("This test would be disabled on MAC");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	public void enabledOnJRETest() {
		System.out.println("This test would be executed in the Java 8 environment");
	}
	
	@Test
	@DisabledOnJre(JRE.JAVA_8)
	public void disabledOnJRETest() {
		System.out.println("This test would be disabled in the Java 8 environment");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "some_env", matches = "true")
	public void executedOnlyIfEnvVariableIsSet() {
		System.out.println("Executed only if environment variable is set");
	}
	
	@Test
	@DisabledIfEnvironmentVariable(named = "some_env", matches = "true")
	public void executedOnlyIfEnvVariableIsNotSet() {
		System.out.println("Executed only if environment variable is not set");
	}
	
	
	@Test
	@EnabledIf("5 * 5 == 25")
	public void executedIfConditionIsTrue() {
		System.out.println("Executed if the script evaluates to true");
	}
	
	@Test
	@EnabledIf(value = {"load('nashorn:mozilla_compat.js')",
			"var num = 3 * 3",
			"num === 9"})
	public void testedWithJavascript() {
		System.out.println("Checked to see if Javascript is evaluated");
	}
}

