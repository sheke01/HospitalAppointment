package com.sheke.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.sheke.demo.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

}
