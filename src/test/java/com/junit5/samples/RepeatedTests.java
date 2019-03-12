package com.junit5.samples;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedTests {

	@RepeatedTest(3)
	public void repeatThisTest3Times() {
		System.out.println("Repeat this test 3 times");
	}
	
	@RepeatedTest(3)
	public void repeatThisTest3Times(RepetitionInfo repetitionInfo) {
		System.out.println("Current repetition "+repetitionInfo.getCurrentRepetition());
	}
}
