package com.testng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	@BeforeClass
	public void beforeClass() {
	    System.out.println("Base >> Before Class");
	}

    @BeforeMethod
    public void setUp() {
        System.out.println("Base >> Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Base >>  After Method");
    }
        
    @AfterClass
    public void afterClass() {
        System.out.println("Base >> After Class");
    }
}
