package tests;

import static org.junit.Assert.*;



import org.junit.Test;

import code.*;

public class TomHandlerTest {

	@Test
	public void test1() {
		Handler classUnderTest = new TomHandler();
		Request request = new Request("TomHedges","34","2");
		
		Boolean actualOutput = classUnderTest.handleRequest(request);
		
		assertTrue("Handler failed to grab",actualOutput);
	}

	@Test
	public void test2() {
		Handler classUnderTest = new TomHandler();
		Request request = new Request("Tom","34","2");
		
		Boolean actualOutput = classUnderTest.handleRequest(request);
		
		assertFalse("Handler failed to grab",actualOutput);
	}

	@Test
	public void test3() {
		Handler classUnderTest = new TomHandler();
		Request request = new Request("TomHedges","34","a");
		
		Boolean actualOutput = classUnderTest.handleRequest(request);
		
		assertFalse("System has handled invalid data",actualOutput);
	}
}
