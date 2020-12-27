package com.yosefmoq.moamenprojecttest;

import com.yosefmoq.moamenprojecttest.utils.Validator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserUnitTest {
        Validator validator;
        @Before
        public void before(){
                validator = new Validator();
        }
        @Test
        public void testEmail(){
                assertEquals(true,validator.isValidUsername("yosefmoq"));
        }

}
