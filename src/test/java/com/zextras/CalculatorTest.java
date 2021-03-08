package com.zextras;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add(1, 2));
    }

}