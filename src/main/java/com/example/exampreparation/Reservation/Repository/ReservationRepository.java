package com.example.exampreparation.Reservation.Repository;
import com.example.exampreparation.Reservation.Model.ReservationModel;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationModel, Long>
{

}
