package com.testng.basics;

// Import TestNG annotations
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCalculatorTest {

    // Reference to AddCalculator class
    AddCalculator addCalculator;

    // Runs once before any test methods in this class
    @BeforeClass
    public void setup() {
        // Initialize AddCalculator object
        addCalculator = new AddCalculator();
    }

    // Test method to verify addition functionality
    @Test
    public void addTest() {
        // Perform addition
        int result = addCalculator.add(5, 10);

        // Print the result
        System.out.println("Result of addition: " + result);
    }
}