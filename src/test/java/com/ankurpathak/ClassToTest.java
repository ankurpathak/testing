package com.ankurpathak;

public class ClassToTest {

    private MyDatabase myDatabase;

    public Boolean query(String query){
        return myDatabase.query(query);
    }


    public ClassToTest(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }
}
