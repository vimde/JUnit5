package com.junit5.samples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class LifeCycleTest {

	@BeforeEach
	public void beforeEachTestExecuteThis() {
		System.out.println("Before each test");
	}
	
	@AfterEach
	public void afterEachTestExecuteThis() {
		System.out.println("After each test");
	}
	
	@Test
	public void firstTest() {
		System.out.println("First test");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second test");
	}
}
