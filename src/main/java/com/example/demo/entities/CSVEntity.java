package com.example.demo.entities;

public class CSVEntity {

    private  String id;
    private String type;
    private  String title;
    private String producer;
    private String caste;
    private String country;
    private String released;
    private String year;
    public CSVEntity(String id, String type, String title, String producer, String caste, String country, String released, String year, String tv, String season, String genre, String description) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.producer = producer;
        this.caste = caste;
        this.country = country;
        this.released = released;
        this.year = year;
        this.tv = tv;
        this.season = season;
        this.genre = genre;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String tv;
    private String season;


    private String genre;
    private String description;

    public CSVEntity(String value, String s, String value1, String s1, String value2, String s2, String value3, String s3, String value4, String s4, String value5) {
        super();
    }



}
