package org.kamenskaya.tripadvisor.app.model.entity.geography;

import org.kamenskaya.tripadvisor.app.model.entity.base.AbstractEntity;

import java.util.Set;

public class City extends AbstractEntity {

    private String name;
    private String district;
    private String region;
    private Set<Station> stations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Station> getStations() {
        return stations;
    }

    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }
}
