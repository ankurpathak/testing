package com.ankurpathak;

public class ArticleManager {
    private User user;
    private ArticleDatabase database;


    public ArticleManager(User user, ArticleDatabase database) {
        this.user = user;
        this.database = database;
    }

    public void initialize() {
        database.addListener(new ArticleListener());
    }

}
