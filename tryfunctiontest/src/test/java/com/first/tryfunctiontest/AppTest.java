package com.first.tryfunctiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {



    @Test
    public void testNumber10() {
    	App a=new App();
        assertEquals(7,a.testfunction());
    }

}
