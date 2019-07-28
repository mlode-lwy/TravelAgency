package pl.sda.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Remigiusz Zudzin
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripPurchese_id;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    @NotNull
    private Double tripPrice;

    @NotNull
    private Integer amountOfAttendees;

}
