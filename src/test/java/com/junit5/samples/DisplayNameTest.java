package com.junit5.samples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Display name works at the class level too")
public class DisplayNameTest {

	@Test
	@DisplayName("Here we can easily write the name that is much better to read")
	public void thisMethodHasAVeryLongNameAndCluttersTheFeatureItIsTryingToTest() {
		
	}
}
