package com.bereczki.work.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "shop_item", indexes = { @Index(columnList = "name") })
public class ShopItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Category category;

    private String name;

    private String description;

    private float price;

    private int quantity;

    private byte[] jpgImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public byte[] getJpgImage() {
        return jpgImage;
    }

    public void setJpgImage(byte[] jpgImage) {
        this.jpgImage = jpgImage;
    }
}
