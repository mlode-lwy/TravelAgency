package pl.sda.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author mlode_wilki
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hotel_id;

    //lotnisko z którego wracamy z wycieczki (np lotnisko w Paryżu, albo lotnisko w Barcelonie)
    @NotBlank
    private String airportFromName;

    @NotBlank
    private String hotel_name;

    @NotBlank
    private Integer hotel_standard;

    @NotBlank
    private String hotel_description;

    @OneToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;




}
