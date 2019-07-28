package pl.sda.travelagency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.travelagency.repository.AirportRepository;

/**
 * @author Remigiusz Zudzin
 */

@Service
public class AirportService {

    private AirportRepository airportRepository;

    @Autowired
    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
}
