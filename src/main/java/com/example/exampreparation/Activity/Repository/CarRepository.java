package com.example.exampreparation.Activity.Repository;

import com.example.exampreparation.Activity.Model.CarModel;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarModel, Long>
{

}
