package com.ankurpathak;



import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
public class SimeMockitoTest {

    @Test
    public void testMockito(){
        List<String> list = mock(List.class);
        when(list.add("Ankur")).thenReturn(true);
        assertThat(list.add("Ankur"), is(true));
    }




}
