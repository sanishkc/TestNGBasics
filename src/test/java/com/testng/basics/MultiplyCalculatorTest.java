package com.testng.basics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultiplyCalculatorTest {
	
	MultiplyCalculator multiplyCalculator;

    @BeforeClass
    public void setup() {
        
    	multiplyCalculator = new MultiplyCalculator();
    }
	
    @Test
    public void multiplyTest() {
        int result = multiplyCalculator.multiply(5, 10);
        System.out.println("Result of multiplication: " + result);
    }
}