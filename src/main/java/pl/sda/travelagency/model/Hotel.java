package pl.sda.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Remigiusz Zudzin
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    // lotnisko powrotne ZMIEN NAZWE
    @NotBlank
    private String airportFromName;

    @OneToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;

}
