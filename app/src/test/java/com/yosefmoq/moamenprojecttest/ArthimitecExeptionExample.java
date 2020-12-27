package com.yosefmoq.moamenprojecttest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArthimitecExeptionExample {
        @Test(expected =  AssertionError.class)
        public void test(){
                double divide = 0/2;
                assertEquals(divide,1);
        }
}
