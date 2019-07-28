package pl.sda.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trip_id;

    private Long hotel_id;

    @NotNull
    private LocalDateTime departureTime_to;
    @NotNull
    private LocalDateTime departureTime_from;
    @NotBlank
    private Integer AmoundTripDays;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private TripType tripType;
    @NotBlank
    private Double adultPrice;
    @NotBlank
    private Double childPrice;
    @NotNull
    private boolean promoted;
    @NotNull
    private Integer placesAmound;


    @OneToMany(mappedBy = "trip")
    private List<TripPurchase> listOfTripPurchases = new ArrayList<>();


}
