package com.example.exampreparation.Reservation.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ReservationModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservationID", nullable = false)
    private Long id;
    private Date reservationDate;
    private Date rentalDate;

    @ManyToOne
    @JoinColumn(name = "reservationID", nullable = false)
    private ReservationModel reservationModel;
}
