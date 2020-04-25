package org.kamenskaya.tripadvisor.app.service;

import org.kamenskaya.tripadvisor.app.model.entity.geography.City;

import java.util.List;

public interface GeographicService {

    List<City> findAllCities();
    void saveCity(City city);

}
