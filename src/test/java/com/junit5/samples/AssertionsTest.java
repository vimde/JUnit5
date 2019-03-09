package com.junit5.samples;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertionsTest {

	@Test
	public void assertSame() {
		Object obj = new Object();
		Object anotherObj = obj;
		Assertions.assertSame(anotherObj, obj);
	}
	
	@Test
	public void assertNotSame() {
		Object obj = new Object();
		Object anotherObj = new Object();
		Assertions.assertNotSame(anotherObj, obj);
	}
	
	@Test
	public void assertEquals() {
		String str = "Value";
		String anotherString = new String("Value");
		Assertions.assertEquals(anotherString, str);
	}
	
	@Test
	public void assertNotEquals() {
		String str = "Value";
		String anotherString = "Val";
		Assertions.assertNotEquals(anotherString, str);
	}
	
	@Test
	public void assertNull() {
		String str = null;
		Assertions.assertNull(str);
	}
	
	@Test
	public void assertNotNull() {
		String str = "not null";
		Assertions.assertNotNull(str);
	}
	
	@Test
	public void assertThrows() {
		String str = null;
		Assertions.assertThrows(NullPointerException.class, () -> str.length());
	}
	
	@Test
	public void assertDoesNotThrow() {
		String str = "Value";
		Assertions.assertDoesNotThrow(() -> str.length());
	}
	
	@Test
	public void assertAll() {
		Person person = new Person();
		person.setAddress("address");
		person.setName("name");
		person.setAge(25);
		person.setPhoneNumber("9999999999");
		Assertions.assertAll("Person related test",
				() -> Assertions.assertNotNull(person.getName()),
				() -> Assertions.assertNotNull(person.getName()),
				() -> Assertions.assertAll("Age related test", 
						() -> Assertions.assertNotNull(person.getAge()),
						() -> Assertions.assertTrue(person.getAge() < 100)));
	}
}
