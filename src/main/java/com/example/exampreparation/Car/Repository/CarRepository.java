package com.example.exampreparation.Car.Repository;

import com.example.exampreparation.Car.Model.CarModel;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarModel, Long>
{

}
