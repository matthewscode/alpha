package com.ggapp.entity;

import javax.persistence.*;

/**
 * Created by Matthew on 11/7/2017.
 */
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private long timestamp;

    private String title;

    private String text;

    @ManyToOne
    private Master master;

    public Article(){}

    public Article(Master master, String title, String text, long timestamp) {
        this.master    = master;
        this.title     = title;
        this.text      = text;
        this.timestamp = timestamp;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
