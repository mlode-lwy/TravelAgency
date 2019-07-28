package pl.sda.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author mlode_wilki
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripPurchase_id;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    @NotNull
    private Double tripPrice;

    @NotNull
    private Integer amoutOfAttendees;

}
