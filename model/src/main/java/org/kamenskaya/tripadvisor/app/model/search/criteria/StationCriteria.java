package org.kamenskaya.tripadvisor.app.model.search.criteria;

import org.kamenskaya.tripadvisor.app.model.entity.transport.TransportType;

import java.util.Objects;

public class StationCriteria {

    private String name;
    private TransportType type;
    private String address;

    public StationCriteria(){}

    private StationCriteria(final String name){
        this.name = Objects.requireNonNull(name);
    }

    public StationCriteria(final TransportType type){
        this.type = Objects.requireNonNull(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
