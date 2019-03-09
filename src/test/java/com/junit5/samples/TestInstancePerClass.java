package com.junit5.samples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
public class TestInstancePerClass {

	@Test
	public void instanceIsCreatedPerClass() {
		System.out.println("Instance: "+this);
	}
	
	@Test
	public void anotherInstanceIsCreatedPerClass() {
		System.out.println("Instance: "+this);
	}
}
