package com.ankurpathak;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class HamcrestStringMatchers {

    private String string, emptyString, nullString, emptyStringWithWhitespace;


    @Before
    public void initializeString(){
        string = "Too much long string!";
        emptyString = "";
        emptyStringWithWhitespace = "  ";
    }


    @Test
    public void stringIsEmpty(){
        assertThat(emptyString, isEmptyString());
    }


    @Test
    public void stringIsEmptyOrNull(){
        assertThat(emptyString, isEmptyOrNullString());
        assertThat(emptyString, isEmptyOrNullString());
    }


    @Test
    public void stringContaingSubstring(){
        assertThat(string, containsString("long"));
    }

    @Test
    public void stringStartingWith(){
        assertThat(string, startsWith("Too"));
    }


    @Test
    public void stringEndingWith(){
        assertThat(string, endsWith("!"));
    }


    




}
