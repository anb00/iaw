package com.iesemilidarder.anicolau.resolution.core.data;

import java.util.UUID;


public abstract   class Product {
    private UUID id = UUID.randomUUID();
    private String name;
    private String description;
    private Double precio = Math.random();
    private String imgUri;

    public UUID getId() {
        return id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
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

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }
}
