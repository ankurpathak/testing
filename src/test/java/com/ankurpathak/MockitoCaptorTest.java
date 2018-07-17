package com.ankurpathak;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
public class MockitoCaptorTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private List<String> list;


    @Captor
    private ArgumentCaptor<List<String>> captor;




    @Test
    public void testArgumentCaptor(){
        List<String> arguments = List.of("Mango", "Orange", "Banana");
        list.addAll(arguments);
        verify(list).addAll(captor.capture());
        assertThat(captor.getValue(), hasSize(3));
        assertThat(captor.getValue(), hasItem("Orange"));
    }




}
