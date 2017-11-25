package com.ggapp.entity;

import javax.persistence.*;

/**
 * Created by Matthew on 11/18/2017.
 */
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    private String location;

    @ManyToOne
    @JoinColumn(name = "chamber_configuration")
    private Chamber chamber;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Chamber getChamber() {
        return chamber;
    }

    public void setChamber(Chamber chamber) {
        this.chamber = chamber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
