package com.yosefmoq.moamenprojecttest;

import com.yosefmoq.moamenprojecttest.utils.Validator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class EmailUnitTest {
        Validator validator;
        @Before
        public void before(){
                validator = new Validator();
        }
        @Test
        public void testEmail(){
                assertEquals(true,validator.isEmailValid("yosefmoqq@gmail.com"));
        }
}