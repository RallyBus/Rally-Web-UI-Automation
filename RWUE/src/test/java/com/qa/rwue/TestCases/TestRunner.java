package com.qa.rwue.TestCases;

import org.testng.TestNG;

/**
 * 
 * @author Pratyush
 *
 * This is Main class which run all my TestNG classes.
 * Created on 11th May 2020
 * Whenever I update anything in TestCases Please update this class and create new jar file by Export option.
 * Then only you need to send that jar to client and client needs to click on jar file and boom our code runs.
 * 
 */

public class TestRunner {

	static TestNG testng;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		testng = new TestNG();
		
		testng.setTestClasses(new Class[] {UserEvent_Test.class});
		testng.run();
		
	}

}
