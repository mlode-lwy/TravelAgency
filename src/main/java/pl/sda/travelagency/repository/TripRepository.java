package pl.sda.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.travelagency.model.Trip;

/**
 * @author Remigiusz Zudzin
 */
@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
