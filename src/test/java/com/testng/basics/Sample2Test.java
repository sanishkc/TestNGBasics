package com.testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2Test extends BaseTest {

    @Test
    public void firstTest() {
        System.out.println("Sample 2 >> Test 1");
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest() {
        System.out.println("Sample 2 >> Test 2");
        Assert.assertEquals("TestNG", "TestNG");
    }
}
