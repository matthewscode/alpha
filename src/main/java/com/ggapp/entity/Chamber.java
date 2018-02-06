package com.ggapp.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Matthew on 11/18/2017.
 */
@Entity
public class Chamber {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @ManyToOne
    private Master master;

    @OneToMany
    private List<Cue> cueList;

    public Long getId() {
        return id;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Cue> getCueList() {
        return cueList;
    }

    public void setCueList(List<Cue> cueList) {
        this.cueList = cueList;
    }
}
