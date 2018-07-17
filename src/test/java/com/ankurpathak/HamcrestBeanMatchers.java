package com.ankurpathak;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class HamcrestBeanMatchers {


    private Todo todo;


    @Before
    public void initializeBean(){
        todo = new Todo(1, "Learn Hamcrest", "Important");
    }



    @Test
    public void beanHasProperty(){
        assertThat(todo, hasProperty("summary"));
    }


    @Test
    public void beanHasPropertyValue(){
        assertThat(todo, hasProperty("summary", is("Learn Hamcrest")));
    }


    @Test
    public void twoBeanSamePropertyValue(){
        Todo todo1 = new Todo(1, "Learn Hamcrest", "Important");
        assertThat(todo1, samePropertyValuesAs(todo1));
    }



    public static class Todo {

        private final long id;
        private String summary;
        private String description;
        private int year;

        public Todo(long id, String summary, String description) {
            this.id = id;
            this.summary = summary;
            this.description = description;
        }

        public long getId() {
            return id;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}
