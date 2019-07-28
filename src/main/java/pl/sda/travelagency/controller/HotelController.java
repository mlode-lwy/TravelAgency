package pl.sda.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.travelagency.model.Hotel;
import pl.sda.travelagency.service.HotelService;

import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
@RestController
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getHotelList();
    }
}
