package com.iesemilidarder.anicolau.resolution.core.data;

import java.util.UUID;

public abstract class Hotel {
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() { return Description; }

    public void setDescription(String description) { Description = description; }

    private UUID id = UUID.randomUUID();
    private String name;
    private String iniciales;
    private String Location;
    private String Description;
}