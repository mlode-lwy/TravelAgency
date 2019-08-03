package pl.sda.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.travelagency.model.Hotel;
import pl.sda.travelagency.service.HotelService;

import java.util.List;

@RestController
public class HotelControler {

    private HotelService hotelService;

    @Autowired
    public HotelControler(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/hotel")
    public List<Hotel> dispalayHotelList(){
        return hotelService.getHotelList();
    }
}
