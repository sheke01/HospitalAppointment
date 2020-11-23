package com.sheke.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.sheke.demo.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

}
