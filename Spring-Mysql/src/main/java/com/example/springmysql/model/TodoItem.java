package com.example.springmysql.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class TodoItem {
    private long ıd;
    private String title;
    private boolean done;

    public TodoItem() {
    }

    public TodoItem(long ıd, String title, boolean done) {
        this.ıd = ıd;
        this.title = title;
        this.done = done;
    }

    @Id
    @GeneratedValue

    public long getId() {
        return ıd;
    }

    public void setId(long ıd) {
        this.ıd = ıd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
