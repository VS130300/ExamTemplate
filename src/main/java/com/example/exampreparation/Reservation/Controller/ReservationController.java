package com.example.exampreparation.Reservation.Controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;

@Controller
@CrossOrigin
@Getter
@Setter
@RequestMapping(value = "/")
public class ReservationController
{
    @PostMapping("/carbooking")
    public ResponseEntity<String> getAllCarReservations(@RequestBody HashMap<String, String> values)
    {
        System.out.println("Cars: " + values);
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }
}
