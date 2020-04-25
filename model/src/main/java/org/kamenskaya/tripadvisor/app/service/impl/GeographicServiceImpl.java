package org.kamenskaya.tripadvisor.app.service.impl;

import org.kamenskaya.tripadvisor.app.infra.util.CommonUtil;
import org.kamenskaya.tripadvisor.app.model.entity.geography.City;
import org.kamenskaya.tripadvisor.app.service.GeographicService;

import java.util.ArrayList;
import java.util.List;

public class GeographicServiceImpl implements GeographicService {

    private final List<City> cities;

    public GeographicServiceImpl() {
        this.cities = new ArrayList<>();
    }

    @Override
    public List<City> findAllCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if (!cities.contains(city)){
            cities.add(city);
        }
    }
}
