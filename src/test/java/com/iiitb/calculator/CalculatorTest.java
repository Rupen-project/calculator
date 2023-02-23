package com.iiitb.calculator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void powerTruePositive(){
        Map<String,Object> payload1 = new HashMap();
        payload1.put("input1",(Object) new String("2"));
        payload1.put("input2",(Object) new String("5"));


        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String("10"));
        payload2.put("input2",(Object) new String("2"));

        assertEquals("Squaring a number for True Positive", 32, calculator.power(payload1), DELTA);
        assertEquals("Squaring a number for True Positive", 100, calculator.power(payload2), DELTA);

    }


    @Test
    public void powerFalsePositive(){
        Map<String,Object> payload1 = new HashMap();
        payload1.put("input1",(Object) new String("2"));
        payload1.put("input2",(Object) new String("5"));


        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String("10"));
        payload2.put("input2",(Object) new String("2"));

        assertNotEquals("Squaring a number for False Positive", 101, calculator.power(payload1), DELTA);
        assertNotEquals("Squaring a number for False Positive", 32, calculator.power(payload2), DELTA);

    }


}