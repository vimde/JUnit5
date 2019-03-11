package com.junit5.samples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Nested test")
@RunWith(JUnitPlatform.class)
public class NestedTest {

	@BeforeEach
	public void beforeEach() {
		System.out.println("Before each - outer");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After each - outer");
	}
	
	@Nested
	public class Inner {
		
		@BeforeEach
		public void beforeEachInner() {
			System.out.println("Before each - inner");
		}
		
		@AfterEach
		public void afterEachInner() {
			System.out.println("After each - inner");
		}
		
		@Test
		public void test1() {
			System.out.println("Inner class first test");
		}
		
		@Test
		public void test2() {
			System.out.println("Inner class second test");
		}
	}
}
