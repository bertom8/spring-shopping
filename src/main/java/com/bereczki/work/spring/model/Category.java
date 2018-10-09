package com.bereczki.work.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
