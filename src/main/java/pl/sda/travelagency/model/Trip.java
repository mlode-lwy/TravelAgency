package pl.sda.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mlode_wilki
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trip_id;

    private Long hotel_id;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime departureTime_to;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime departureTime_from;

    @NotNull
    private Integer amountTripDays;

    @Enumerated(EnumType.STRING)
    private TripType tripType;

    @NotNull
    private Double adultPrice;

    @NotNull
    private Double childPrice;

    @NotNull
    private Boolean isPromoted;

    @NotNull
    private Integer placesAmount;

    @OneToMany(mappedBy = "trip")
    private List<TripPurchase> listOfTripPurchases = new ArrayList<>();
}
