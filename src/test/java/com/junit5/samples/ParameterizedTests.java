package com.junit5.samples;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ParameterizedTests {

	@ParameterizedTest(name = "For the parameter is {0}")
	@ValueSource(ints = {3,4,5,2,1})
	public void integerParameters(int number) {
		System.out.println("Number "+number);
	}
	
	@ParameterizedTest(name = "The element is {0}")
	@EnumSource(DAY.class)
	public void enumSource(DAY day) {
		System.out.println("Day "+day);
	}
	
	
	private static List<Arguments> testMethodSource() {
		return Arrays.asList(Arguments.of(1, "One"), Arguments.of(2, "Two"));
	}
	
	@ParameterizedTest
	@MethodSource("testMethodSource")
	public void methodSource(int input, String output) {
		System.out.println("Input: "+input+"  Output: "+ output);
	}
	
	
}

enum DAY {
	SUN, MON, TUE, WED, THU, FRI, SAT
}
