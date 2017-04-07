package com.murali.selenium;


import org.junit.Assert;
import org.junit.Test;


public class SeleniumTest  {
	
	@Test
    public  void testRun() {
    	SeleniumTestRunner runner = new SeleniumTestRunner();
    	Assert.assertFalse(runner.run());
    	
    }
}
