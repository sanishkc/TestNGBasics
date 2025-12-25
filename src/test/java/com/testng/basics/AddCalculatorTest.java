package com.testng.basics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCalculatorTest {
	
	AddCalculator addCalculator;

    @BeforeClass
    public void setup() {
        
    	addCalculator = new AddCalculator();
    }
	
    @Test
    public void addTest() {
        int result = addCalculator.add(5, 10);
        System.out.println("Result of addition: " + result);
    }

}
