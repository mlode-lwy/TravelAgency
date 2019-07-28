package pl.sda.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.travelagency.model.Trip;
import pl.sda.travelagency.model.TripType;
import pl.sda.travelagency.service.TripService;

/**
 * @author Remigiusz Zudzin
 */

@Controller
public class TripController {

    private TripService tripService;

    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping("/trip")
    public String showNewTripForm(Model model) {
        Trip trip = new Trip();
        model.addAttribute("trip",trip);
        model.addAttribute("tripType", TripType.values());
        return "trip_form";
    }

    @PostMapping("/trip/save")
    public String saveTrip(@ModelAttribute("trip") Trip trip) {
        tripService.addTrip(trip);
        return "index";
    }
}
