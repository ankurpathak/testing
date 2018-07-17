package com.ankurpathak;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class MockitoTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Mock
    private MyDatabase databaseMock;


    @Test
    public void testQuery(){
        ClassToTest t = new ClassToTest(databaseMock);
        when(databaseMock.query("* from t")).thenReturn(true);
        assertTrue(t.query("* from t"));
        verify(databaseMock).query("* from t");
        verifyNoMoreInteractions(databaseMock);
    }
}
