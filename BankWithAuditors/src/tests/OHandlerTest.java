package tests;

import static org.junit.Assert.*;



import org.junit.Test;

import code.*;

public class OHandlerTest {

	@Test
	public void test() {
		Handler classUnderTest = new OHandler();
		Request request = new Request("Oded","5","10");
		
		Boolean actualOutput = classUnderTest.handleRequest(request);
		
		assertTrue("Handler failed to grab",actualOutput);
	}

	@Test
	public void test2() {
		Handler classUnderTest = new OHandler();
		Request request = new Request("Ode","5","10");
		
		Boolean actualOutput = classUnderTest.handleRequest(request);
		
		assertFalse("Handler failed to grab",actualOutput);
	}
}
