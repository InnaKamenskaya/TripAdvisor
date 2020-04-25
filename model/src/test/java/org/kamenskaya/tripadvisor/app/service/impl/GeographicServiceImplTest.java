package org.kamenskaya.tripadvisor.app.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.kamenskaya.tripadvisor.app.model.entity.geography.City;
import org.kamenskaya.tripadvisor.app.service.GeographicService;

import java.util.List;

import static org.junit.Assert.*;

public class GeographicServiceImplTest {
    private GeographicService geographicService;

    @Before
    public void setup(){
        geographicService = new GeographicServiceImpl();
    }

    @Test
    public void testNoDataReturnedAtStart(){
        List<City> cities = geographicService.findAllCities();
        assertTrue(cities.isEmpty());
    }

    @Test
    public void testSaveNewCitySuccess(){
        City city = new City("Kyiv");
        geographicService.saveCity(city);

        List<City> cities = geographicService.findAllCities();
        assertEquals(cities.size(), 1);
        assertEquals(cities.get(0).getName(), "Kyiv");
    }
}