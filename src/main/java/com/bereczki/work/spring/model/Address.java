package com.bereczki.work.spring.model;

import javax.persistence.*;

@Embeddable
public class Address {

    @Enumerated(value = EnumType.STRING)
    private Country country;

    private String zipCode;

    private String city;

    private String street;

    public enum Country {
        HUNGARY
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
