/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.ChainFactory;
import code.Handler;
import code.OHandler;
import code.Request;

/**
 * @author oded
 *
 */
public class ChainFactoryTest {

	@Test
	public void test() {
		Handler firstHandler = new OHandler();
		Handler secondHandler = new JHandler();
		Handler headHandler;
		
		ChainFactory classUnderTest = new ChainFactory();
		
		
		Request request = new Request("Oded","5","10");
		
		Boolean actualOutput = classUnderTest.handleRequest(request);
		
		assertTrue("Handler failed to grab",actualOutput);
	}

}
