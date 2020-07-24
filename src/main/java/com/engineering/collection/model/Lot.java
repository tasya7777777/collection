package com.engineering.collection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lot")
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    @Column(name = "creator")
    private String creator;
    @Column(name = "countryCreator")
    private String countryCreator;
    @Column(name = "belonging")
    private String belonging;
    @Column(name = "idList")
    private String idList;

    public Lot() {
    }

    public Lot(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.name = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCreator(String creator) {
        this.name = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCountryCreator(String countryCreator) {
        this.name = countryCreator;
    }

    public String getCountryCreator() {
        return this.countryCreator;
    }

    public void setBelonging(String belonging) {
        this.name = belonging;
    }

    public String getBelonging() {
        return this.belonging;
    }

    public void setIdList(String idList) {
        this.name = idList;
    }

    public String getIdList() {
        return this.idList;
    }
}