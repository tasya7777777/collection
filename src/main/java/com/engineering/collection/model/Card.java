package com.engineering.collection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "available")
    private String available;
    @Column(name = "lotId")
    private String lotId;
    @Column(name = "description")
    private String description;
    @Column(name = "tags")
    private String tags;

    public Card() {
    }

    public Card(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String name) {
        this.name = type;
    }

    public String getType() { return this.type; }

    public void setAvailable(String available) {
        this.name = available;
    }

    public String getAvailable() { return this.available; }

    public void setLotId(String lotId) { this.name = lotId; }

    public String getLotId() { return this.lotId; }

    public void setDescription(String description) { this.name = description; }

    public String getDescription() { return this.description; }

    public void setTags(String tags) { this.name = tags; }

    public String getTags() { return this.tags; }
}



