package pl.sda.travelagency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.travelagency.model.Airport;
import pl.sda.travelagency.model.Hotel;
import pl.sda.travelagency.repository.AirportRepository;
import pl.sda.travelagency.repository.HotelRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Remigiusz Zudzin
 */
@Service
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).get();
    }

    public List<Hotel> getHotelList() {
        return hotelRepository.findAll();
    }
}
