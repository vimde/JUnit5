package com.junit5.samples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@TestInstance(Lifecycle.PER_METHOD)
@RunWith(JUnitPlatform.class)
public class TestInstancePerMethod {

	
	@Test
	public void newInstanceForEveryMethod() {
		System.out.println("Instance: "+this);
	}
	
	@Test
	public void anotherTestToShowNewInstanceIsCreatedForEveryMethod() {
		System.out.println("Instance: "+this);
	}
}
