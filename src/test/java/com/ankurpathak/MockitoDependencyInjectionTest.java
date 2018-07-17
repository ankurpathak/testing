package com.ankurpathak;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;


public class MockitoDependencyInjectionTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Mock
    private User user;

    @Mock
    private ArticleDatabase database;

    @InjectMocks
    private ArticleManager manager;


    @Test
    public void shouldDoSomething() {

        manager.initialize();
        verifyZeroInteractions(user);
        verify(database).addListener(any(ArticleListener.class));
    }



}
