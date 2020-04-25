package org.kamenskaya.tripadvisor.app.model.entity.geography;

import org.kamenskaya.tripadvisor.app.model.entity.base.AbstractEntity;
import org.kamenskaya.tripadvisor.app.model.entity.transport.TransportType;

import java.util.Objects;

public class Station extends AbstractEntity {

    private City city;
    private Address address;
    private String phone;
    private Coordinate coordinate;
    private TransportType type;

    public Station(final City city, final TransportType type) {
        this.city = Objects.requireNonNull(city);
        this.type = Objects.requireNonNull(type);
    }

    public City getCity() {
        return city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public TransportType getType() {
        return type;
    }
}
