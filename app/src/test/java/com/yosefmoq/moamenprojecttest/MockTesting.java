package com.yosefmoq.moamenprojecttest;

import com.yosefmoq.moamenprojecttest.utils.Person;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockTesting {
        @Test
        public void playTest() {
                Person person = new Person("name", 15);

                Person person1 = Mockito.spy(person);

                Mockito.doReturn(true).when(person1).runInGround("ground");

                Assert.assertEquals(true, person1.isPlay());
        }

}
