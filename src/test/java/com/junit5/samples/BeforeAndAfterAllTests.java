package com.junit5.samples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BeforeAndAfterAllTests {
	
	@BeforeAll
	public static void executeBeforeAllTests() {
		System.out.println("Executed once before all the tests");
	}

	@AfterAll
	public static void executeAfterAllTests() {
		System.out.println("Executed after all the tests");
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
