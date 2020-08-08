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

    public Card(long id, String name, String type, String available, String lotId, String description, String tags) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.available = available;
        this.lotId = lotId;
        this.description = description;
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", available='" + available + '\'' +
                ", lotId='" + lotId + '\'' +
                ", description='" + description + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}



