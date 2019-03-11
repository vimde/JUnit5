package com.junit5.samples;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.junit5.samples")
@IncludeTags({"slow-test", "third-tag"})

// likewise @ExcludeTags("slow-test") can be added too
public class IncludeTagTest {

	
}
