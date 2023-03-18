package com.iiitb.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest{

//    Calculator calc = new Calculator();
    CalcOperations calcOperations = new CalcOperations();
    private final double delta =0.000000000001;

    @Test
    public void add() {
        Assert.assertEquals(10,calcOperations.add(8,2),delta);
        Assert.assertEquals(10,calcOperations.add(5,5),delta);
    }
    @Test
    public void addFalsePositive(){
        Assert.assertNotEquals(12,calcOperations.add(2,5),delta);
        Assert.assertNotEquals(0,calcOperations.add(4,4),delta);
    }

    @Test
    public void subtract() {
        Assert.assertEquals(0,calcOperations.subtract(4,4),delta);
        Assert.assertEquals(0,calcOperations.subtract(-4,-4),delta);
        Assert.assertEquals(-4,calcOperations.subtract(4,8),delta);
    }
    @Test
    public void subtractFalsePositive(){
        Assert.assertNotEquals(10,calcOperations.subtract(10,2),delta);
        Assert.assertNotEquals(14,calcOperations.subtract(16,-2),delta);
    }

    @Test
    public void multiply() {
        Assert.assertEquals(0,calcOperations.multiply(0,1),delta);
        Assert.assertEquals(10,calcOperations.multiply(5,2),delta);
    }

    @Test
    public void multiplyFalsePositive(){
        Assert.assertNotEquals(10,calcOperations.multiply(10,0),delta);
        Assert.assertNotEquals(25,calcOperations.multiply(5,1),delta);
    }

    @Test
    public void divide() {
        Assert.assertEquals(2,calcOperations.divide(10,5),delta);
        Assert.assertEquals(Double.POSITIVE_INFINITY,calcOperations.divide(1,0),delta);
        Assert.assertEquals(Double.NEGATIVE_INFINITY,calcOperations.divide(-1,0),delta);
    }

    @Test
    public void divideFalsePositive(){
        Assert.assertNotEquals(3,calcOperations.divide(6,3),delta);
        Assert.assertNotEquals(6,calcOperations.divide(6,0),delta);
    }

    @Test
    public void squareRoot(){
        Assert.assertEquals(4.0,calcOperations.squareRoot(16),delta);
        Assert.assertEquals(Math.sqrt(1564.564),calcOperations.squareRoot(1564.564),delta);
        Assert.assertEquals(Double.NaN,calcOperations.squareRoot(-2),delta);
    }

    @Test
    public void squareRootFalsePositive(){
        Assert.assertNotEquals(2,calcOperations.squareRoot(5),delta);
        Assert.assertNotEquals(2,calcOperations.squareRoot(-4),delta);
    }

    @Test
    public void fatorial(){
        Assert.assertEquals(120,calcOperations.factorial(5),delta);
        Assert.assertEquals(1,calcOperations.factorial(0),delta);
        Assert.assertEquals(1,calcOperations.factorial(1),delta);
        Assert.assertEquals(Double.NaN,calcOperations.factorial(-2),delta);
    }

    public void factorialFalsePositive(){
        Assert.assertNotEquals(24,calcOperations.factorial(-4),delta);
        Assert.assertNotEquals(0,calcOperations.factorial(0),delta);
    }

    @Test
    public void naturalLog(){
        Assert.assertEquals(1,calcOperations.naturalLog(Math.exp(1)),delta);
        Assert.assertEquals(Math.log(23.56),calcOperations.naturalLog(23.56),delta);
        Assert.assertEquals(Math.log(0),calcOperations.naturalLog(0),delta);
        Assert.assertEquals(Double.NEGATIVE_INFINITY,calcOperations.naturalLog(0),delta);
    }

    @Test
    public void naturalLogFalsePositive(){
        Assert.assertNotEquals(0,calcOperations.naturalLog(0),delta);
    }

    @Test
    public void power(){
        Assert.assertEquals(16,calcOperations.power(4,2),delta);
        Assert.assertEquals(1,calcOperations.power(1,0),delta);
        Assert.assertEquals(Double.NaN,calcOperations.power(-2,-0.99),delta);
        Assert.assertEquals(-0.125,calcOperations.power(-2,-3),delta);
    }

    @Test
    public void powerFalsePositive(){
        Assert.assertNotEquals(-2,calcOperations.power(-4,-0.5),delta);
    }



}