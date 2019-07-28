package pl.sda.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.travelagency.model.City;
import pl.sda.travelagency.service.CityService;

import java.util.List;

@RestController
public class CityController {

    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city")
    public List<City> cityList(){
        return cityService.getAllCities();
    }
}
