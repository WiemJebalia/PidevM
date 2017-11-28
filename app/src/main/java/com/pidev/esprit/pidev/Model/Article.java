package com.pidev.esprit.pidev.Model;

import java.util.Date;

/**
 * Created by esprit on 21/11/2017.
 */

public class Article {
    private int id;
    private String name;
    private String body;
    private String image;
    private Date date;

    public Article() {
    }

    public Article(int id, String name, String body, String image, Date date, boolean favourite, String other) {
        this.id = id;
        this.name = name;
        this.body = body;
        this.image = image;
        this.date = date;
        this.favourite = favourite;
        this.other = other;
    }

    private boolean favourite;
    private String other;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
