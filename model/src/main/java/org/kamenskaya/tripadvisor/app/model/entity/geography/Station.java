package org.kamenskaya.tripadvisor.app.model.entity.geography;

import org.kamenskaya.tripadvisor.app.model.entity.base.AbstractEntity;

public class Station extends AbstractEntity {

    private City city;
    private Address address;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
