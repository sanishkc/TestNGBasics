package com.testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1Test extends BaseTest {

    @Test
    public void firstTest() {
        System.out.println("Sample 1 >> Test 1");
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest() {
        System.out.println("Sample 1 >> Test 2");
        Assert.assertEquals("TestNG", "TestNG");
    }
}
