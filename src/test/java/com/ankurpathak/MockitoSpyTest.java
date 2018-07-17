package com.ankurpathak;


import org.junit.Rule;
import org.junit.Test;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockitoSpyTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Spy
    private Properties p = new Properties();


    @Spy
    private List<String> list = new LinkedList<>();



    @Test
    public void testSpy(){
        doReturn("45").when(p).get("shoeSize");
        assertEquals("45", p.get("shoeSize"));
        verify(p).get("shoeSize");
        verifyNoMoreInteractions(p);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testLinkedListSpyWrong(){
        when(list.get(0)).thenReturn("foo");
        assertEquals("foo", list.get(0));
    }

    @Test
    public void testLinkedListSpyCorrect(){
        doReturn("foo").when(list).get(0);
        assertEquals("foo", list.get(0));
        verify(list).get(0);
        verifyNoMoreInteractions(list);
    }



}
