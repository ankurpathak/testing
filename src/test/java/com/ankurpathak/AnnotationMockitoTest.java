package com.ankurpathak;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@PrepareForTest(List.class)
public class AnnotationMockitoTest {

    @Rule
    public PowerMockRule powerMockRule = new PowerMockRule();


    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();




    @Mock
    private List<String> list;

    @Test
    public void testMockitoAnnotation(){
        when(list.add("Ankur")).thenReturn(true);
        assertThat(list.add("Ankur"), is(true));
    }
}
