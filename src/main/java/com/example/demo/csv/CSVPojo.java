package com.example.demo.csv;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.Column;

public class CSVPojo {
//    @CsvBindByName(column="id")
//    private Long id;

    @CsvBindByName(column="show_id")
    private String show_id;

    @CsvBindByName(column="type_in")
    private String type_in;

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

    @CsvBindByName(column="title")
    private String title;

    @CsvBindByName(column="producer")
    private String producer;

    @CsvBindByName(column="caste")
    private String caste;


    @CsvBindByName(column="country")
    private String country;

    @CsvBindByName(column="released")
    private String released;

    @CsvBindByName(column="year")
    private String year;

    @CsvBindByName(column="tv")
    private String tv;

    @CsvBindByName(column="seasons")
    private String seasons;


    @CsvBindByName(column="genre")
    private String genre;

    @CsvBindByName(column="description")
    private String description;


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getType_in() {
        return type_in;
    }

    public void setType_in(String type_in) {
        this.type_in = type_in;
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

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
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
}
