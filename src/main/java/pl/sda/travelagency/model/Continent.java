package pl.sda.travelagency.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mlode_wilki
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long continent_id;

    @NotBlank
    private String continent_name;

    @OneToMany(mappedBy = "continent")
    @JsonIgnore
    private List<Country> listOfCountries = new ArrayList<>();

}
