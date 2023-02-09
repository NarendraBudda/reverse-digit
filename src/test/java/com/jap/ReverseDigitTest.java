package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest {

    ReverseDigit ReverseDigit;
    @Before
    public void setUp() {
        ReverseDigit = new ReverseDigit();

    }
    @After
    public void tearDown() {
        ReverseDigit=null;

    }
    @Test
    public void givenInputPositiveNumberReverseTheDigit(){
        int actualResult = ReverseDigit.getReverse(12345);
        assertEquals(54321,actualResult);
    }
    @Test
    public void givenInputNegativeNumberReverseTheDigit(){
        int actualResult = ReverseDigit.getReverse(-12345);
        assertEquals(-54321,actualResult);
    }




}