package com.iiitb.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest{

    Calculator calc = new Calculator();
    @Test
    public void addTest(){
        Assert.assertEquals(11, calc.add(7, 4));
        Assert.assertEquals(10, calc.add(5, 5));
    }

}