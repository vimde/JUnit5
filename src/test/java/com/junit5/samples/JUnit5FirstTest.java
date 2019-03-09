package com.junit5.samples;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class JUnit5FirstTest {

	@Test
	public void assertUsingJUnit5() {
		List<Integer> list = new ArrayList<>();
		Assertions.assertTrue(list.isEmpty());
	}
}
