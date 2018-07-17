package com.ankurpathak;


import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitMatchers {

    @Test
    public void letTestJunit(){
        boolean a = true;
        boolean b = true;

        assertEquals(b, a);

        assertNotEquals(false, a);

    }
}
