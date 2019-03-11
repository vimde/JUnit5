package com.junit5.samples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TagTests {

	@Test
	@Tag("slow-test")
	public void excludeOrIncludeTheTestsWithAParticularTag() {
		System.out.println("This is a slow test");
	}
	
	@Test
	@Tag("slow-test")
	@Tag("another-tag")
	public void twoTagsCanBeAdded() {
		System.out.println("Multiple tags can be added too");
	}
	
	@Test
	@Tag("third-tag")
	public void usedInIncludeTagTest() {
		System.out.println("This method is executed in IncludeTag test");
	}
}
