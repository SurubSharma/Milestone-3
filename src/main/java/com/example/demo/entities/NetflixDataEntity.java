package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@Table(name="persons")
public class NetflixDataEntity {

    @Id
    @Column(name="show_id")
    private String show_id;

    @Column(name="type_in")
    private String type_in;
    public NetflixDataEntity(String value, String s, String value1, String s1, String value2, String s2, String value3, String s3, String value4, String s4, String value5) {

    }

    @Override
    public String toString() {
        return "NetflixDataEntity{" +
                "show_id='" + show_id + '\'' +
                ", type_in='" + type_in + '\'' +
                ", title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", caste='" + caste + '\'' +
                ", country='" + country + '\'' +
                ", released='" + released + '\'' +
                ", year='" + year + '\'' +
                ", tv='" + tv + '\'' +
                ", seasons='" + seasons + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public NetflixDataEntity(String show_id, String type_in, String title, String producer, String caste, String country, String released, String year, String tv, String seasons, String genre, String description) {
        this.show_id = show_id;
        this.type_in = type_in;
        this.title = title;
        this.producer = producer;
        this.caste = caste;
        this.country = country;
        this.released = released;
        this.year = year;
        this.tv = tv;
        this.seasons = seasons;
        this.genre = genre;
        this.description = description;
    }

    @Column(name="title")
    private String title;

    @Column(name="producer")
    private String producer;

    @Column(name="caste")
    private String caste;

    @Column(name="country")
    private String country;

    @Column(name="released")
    private String released;

    @Column(name="year")
    private String year;

    @Column(name="tv")
    private String tv;

    @Column(name="seasons")
    private String seasons;


    @Column(name="genre")
    private String genre;

    @Column(name="description")
    private String description;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

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
