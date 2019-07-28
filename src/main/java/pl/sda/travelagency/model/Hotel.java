package pl.sda.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Remigiusz Zudzin
 */
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotel_id;
    @NotBlank
    private String hotel_name;
    @NotBlank
    private Integer hotel_standard;
    @NotBlank
    private String hotel_description;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
