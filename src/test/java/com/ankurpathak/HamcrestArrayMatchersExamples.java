package com.ankurpathak;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.rules.RuleChain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestArrayMatchersExamples {
    private Integer[] integers;


    @Before
    public void initializeArray(){
        integers =  new Integer[]{7, 5, 12, 16};
    }


    @Test
    public void hasSizeOf4(){
        assertThat(integers, arrayWithSize(4));
    }


    @Test
    public void containing(){
        assertThat(integers, arrayContaining(7, 5, 12, 16));
    }

    @Test
    public void containingInAnyOrder(){
        assertThat(integers, arrayContainingInAnyOrder(5, 12, 7, 16));
    }


    @Test
    public void hasElement(){
        assertThat(integers, hasItemInArray(12));
    }

    @Test
    public void hasElements(){
        assertThat(integers, hasItemInArray(greaterThan(4)));
    }
}
