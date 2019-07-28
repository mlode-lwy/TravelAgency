package pl.sda.travelagency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.travelagency.model.Trip;
import pl.sda.travelagency.repository.HotelRepository;
import pl.sda.travelagency.repository.TripRepository;

import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
@Service
public class TripService {

    private TripRepository tripRepository;
    private HotelRepository hotelRepository;

    @Autowired
    public TripService(TripRepository tripRepository, HotelRepository hotelRepository) {
        this.tripRepository = tripRepository;
        this.hotelRepository = hotelRepository;
    }

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public void addTrip(Trip trip) {

        tripRepository.save(trip);

    }
}
