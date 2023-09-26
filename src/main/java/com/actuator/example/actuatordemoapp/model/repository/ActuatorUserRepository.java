package com.actuator.example.actuatordemoapp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.actuator.example.actuatordemoapp.model.entity.ActuatorUser;

@Repository
public interface ActuatorUserRepository extends CrudRepository<ActuatorUser,Long> {
}
