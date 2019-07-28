package pl.sda.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.travelagency.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {


}
