package com.sheke.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.sheke.demo.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
