package com.murali.selenium;


import org.junit.Assert;
import org.junit.Test;

/**
 * Simple Test class 
 * @author madhavi d
 *
 */
public class SeleniumTest  {
	
	@Test
    public  void testRun() {
    	SeleniumTestRunner runner = new SeleniumTestRunner();
    	Assert.assertTrue(runner.run());
    	
    }
	
	@Test
    public  void testRun2() {
    	SeleniumTestRunner runner = new SeleniumTestRunner();
    	Assert.assertTrue(runner.run());
    	
    }
}
