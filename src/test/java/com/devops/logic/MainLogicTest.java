package com.devops.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainLogicTest {

	@Test
	public void testMainLogicConstructor() {
		try {
			new MainLogic("Hello World");
		} catch (Exception e) {
			fail("Construction failed.");
		}
	}

	public void testGetMessage() {
		assertEquals("Hello World", new MainLogic("Hello World").getMessage());
	}

}
