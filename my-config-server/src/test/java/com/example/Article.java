package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Article {

    private final String title;
    private final String author;
    private final List<String> tags;

    private Article(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }
}
