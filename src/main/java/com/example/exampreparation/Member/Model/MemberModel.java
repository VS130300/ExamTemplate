package com.example.exampreparation.Member.Model;

import com.example.exampreparation.Reservation.Model.ReservationModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MemberModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberID", nullable = false)
    private int bookingID;

    private String firstName = "Victor";
    private String lastName = "Schweitz";
    private String street = "Tietgensvej";
    private String city = "Hillerød";
    private int zip = 3400;
    private boolean isApproved = true;
    private int ranking = 5;


    @OneToMany
    @JsonBackReference
    @JoinColumn(name = "memberID")
    private List<ReservationModel> reservationList;
}
