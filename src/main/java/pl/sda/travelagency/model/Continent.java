package pl.sda.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
@Entity
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long continent_id;

    @NotBlank
    private String continent_name;

    @OneToMany(mappedBy = "continent")
    private List<Country> listOfCountries = new ArrayList<>();
}
