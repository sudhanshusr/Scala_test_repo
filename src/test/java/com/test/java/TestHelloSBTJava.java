package com.test.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.java.HelloSBTJava;
public class TestHelloSBTJava {
	@Test
	public void testHello() {
		HelloSBTJava obj = new HelloSBTJava("Cybage");
		assertEquals("Hello Cybage", obj.hello());
	}
}
