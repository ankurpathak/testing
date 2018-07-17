package com.ankurpathak;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.AdditionalMatchers;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Iterator;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.AdditionalMatchers.gt;
import static org.mockito.Mockito.*;

import static org.mockito.ArgumentMatchers.*;

public class MockitoTest1 {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Mock
    private MyClass test;

    @Mock
    private Iterator<String> i;


    @Mock
    private Comparable<String> c;


    @Mock
    private Properties p;


    @Test
    public void test1(){
        when(test.getUniqueId()).thenReturn(43);
        assertEquals(43, test.getUniqueId());
        verify(test).getUniqueId();
        verifyNoMoreInteractions(test);
    }


    @Test
    public void testThanMoreReturnvalue(){
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        assertEquals("Mockito", i.next());
        assertEquals("rocks", i.next());
        verify(i, times(2)).next();
        verifyNoMoreInteractions(test);
    }


    @Test
    public void testReturnValueDependentOnMethodParameter(){
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Ecllipse")).thenReturn(2);
        assertEquals(1, c.compareTo("Mockito"));
        assertEquals(2, c.compareTo("Ecllipse"));
        verify(c).compareTo("Mockito");
        verify(c).compareTo("Ecllipse");
        verifyNoMoreInteractions(c);
    }


    @Test
    public void testReturnValueInDependentOnMethodParameter(){
        when(c.compareTo(anyString())).thenReturn(-1);
        assertEquals(-1, c.compareTo("Mockito"));
        assertEquals(-1, c.compareTo("Ecllipse"));
        verify(c).compareTo("Mockito");
        verify(c).compareTo("Ecllipse");
        verifyNoMoreInteractions(c);

    }


    @Test(expected = IllegalArgumentException.class)
    public void testEXception(){
        when(p.get("Anddroid")).thenThrow(IllegalArgumentException.class);
        p.get("Anddroid");

    }






    @Test
    public void testVerify(){
        when(test.getUniqueId()).thenReturn(43);
        test.getUniqueId();
        test.getUniqueId();
        test.testing(12);
        verify(test).testing(gt(11));

        verify(test, times(2)).getUniqueId();

        verify(test, never()).someMethod("never called");
        //verify(test, atLeastOnce()).someMethod("called atleast once");
        //verify(test, atLeast(2)).someMethod("called atleast twice");
        //verify(test, times(5)).someMethod("called 5 times");

        //verify(test, atMost(3)).someMethod("called atmost 5 times");

        verifyNoMoreInteractions(test);

    }
}
