package pl.sda.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.travelagency.model.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
