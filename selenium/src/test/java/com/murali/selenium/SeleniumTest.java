package com.murali.selenium;


import org.junit.Assert;
import org.junit.Test;

/**
 * Simple Test class 
 * @author muraleedharnelakonda
 *
 */
public class SeleniumTest  {
	
	@Test
    public  void testRun() {
    	SeleniumTestRunner runner = new SeleniumTestRunner();
    	Assert.assertTrue(runner.run());
    	
    }
}
