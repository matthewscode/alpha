package com.ggapp.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Matthew on 11/18/2017.
 */
@Entity
public class Master {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String username;

    private long timestamp;

    @OneToMany
    private List<Article> articleList;

    @OneToMany
    private List<Chamber> chamberList;

    public Master(){}

    public Master(String username, long timestamp) {
        this.username  = username;
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
