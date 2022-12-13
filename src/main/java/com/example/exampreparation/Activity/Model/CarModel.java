package com.example.exampreparation.Activity.Model;


import com.example.exampreparation.Reservation.Model.ReservationModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Member;
import java.util.List;

@Entity
@Getter
@Setter
public class CarModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carModel", nullable = false)
    private String carModel;

    @OneToMany
    @JsonBackReference
    @JoinColumn(name = "carModel")
    private List<ReservationModel> reservationModels;
}
