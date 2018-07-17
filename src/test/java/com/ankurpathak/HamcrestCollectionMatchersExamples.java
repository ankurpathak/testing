package com.ankurpathak;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestCollectionMatchersExamples {

    private List<Integer> list;


    @Before
    public void initializeList(){
       list = Arrays.asList(5, 2, 4);

    }



    @Test
    public void hasElement(){
        assertThat(list, hasItem(2));
    }


    public void hasElements(){
        assertThat(list, hasItems(2,5));
    }

    @Test
    public void hasSizeOf3(){
        assertThat(list, hasSize(3));
    }

    @Test
    public void containsNumberInOrder(){
        assertThat(list, contains(5,2,4));
    }

    @Test
    public void containsNumbersInAnyOrder(){
        assertThat(list, containsInAnyOrder(2,4,5));
    }


    @Test
    public void everyItemGreaterThan1(){
        assertThat(list, everyItem(greaterThan(1)));
    }



}
