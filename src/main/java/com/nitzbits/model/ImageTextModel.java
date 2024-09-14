package com.nitzbits.model;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class ImageTextModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "shortDesc", nullable = false)
    private String shortDesc;

//    @Column(name = "picByte", length = 1000)
//    private byte[] picByte;

    @Column(name = "image_url", nullable = false)
    private String imageURL;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

//    public byte[] getPicByte() {
//        return picByte;
//    }
//
//    public void setPicByte(byte[] picByte) {
//        this.picByte = picByte;
//    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
