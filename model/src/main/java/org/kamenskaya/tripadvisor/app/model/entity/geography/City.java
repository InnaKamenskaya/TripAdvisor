package org.kamenskaya.tripadvisor.app.model.entity.geography;

import org.kamenskaya.tripadvisor.app.model.entity.base.AbstractEntity;
import org.kamenskaya.tripadvisor.app.infra.util.CommonUtil;
import org.kamenskaya.tripadvisor.app.model.entity.transport.TransportType;

import java.util.*;

public class City extends AbstractEntity {

    private String name;
    private String district;
    private String region;
    private Set<Station> stations;

    public City(final String name) {
        this.name = name;
    }

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
        return CommonUtil.getSafeSet(stations);
    }

/*    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }*/

    public Station addStation(final TransportType type){
        if (stations == null){
            stations = new HashSet<>();
        }
        Station station = new Station(this, type);
        stations.add(station);
        return station;
    }

    public void removeStation(final Station station){
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (stations == null){
            return;
        }
        stations.remove(station);
    }
}
