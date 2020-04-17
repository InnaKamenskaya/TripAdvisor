package org.kamenskaya.tripadvisor.app.model.entity.geography;

import org.kamenskaya.tripadvisor.app.model.entity.base.AbstractEntity;

public class Address extends AbstractEntity {

    private String zipCode;
    private String street;
    private String house;
    private String apartment;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}