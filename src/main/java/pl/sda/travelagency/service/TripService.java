package pl.sda.travelagency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.travelagency.model.Trip;
import pl.sda.travelagency.repository.HotelRepository;
import pl.sda.travelagency.repository.TripRepository;

@Service
public class TripService {

    private TripRepository tripRepository;
    private HotelRepository hotelRepository;

    @Autowired
    public TripService(TripRepository tripRepository, HotelRepository hotelRepository) {
        this.tripRepository = tripRepository;
        this.hotelRepository = hotelRepository;
    }

    public void addTrip(Trip trip){
        tripRepository.save(trip);
    }

}
