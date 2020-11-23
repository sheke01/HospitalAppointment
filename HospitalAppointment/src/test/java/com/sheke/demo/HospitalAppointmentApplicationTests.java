package com.sheke.demo;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sheke.demo.entities.Appointment;
import com.sheke.demo.entities.Doctor;
import com.sheke.demo.entities.Insurance;
import com.sheke.demo.entities.Patient;
import com.sheke.demo.repos.AppointmentRepository;
import com.sheke.demo.repos.DoctorRepository;
import com.sheke.demo.repos.PatientRepository;

@SpringBootTest
class HospitalAppointmentApplicationTests {
	
	@Autowired
	DoctorRepository doctorRepo;
	
	@Autowired
	PatientRepository patientRepo;
	
	@Autowired
	AppointmentRepository appointmentRepo;

	@Test
	void contextLoads() {
	}
	
	/*@Test
	void testCreateDoctor() {
		Doctor doctor = new Doctor();
		doctor.setFirstName("Vincent");
		doctor.setLastName("Sheke");
		doctor.setSpeciality("Paediatrician");
		
		doctorRepo.save(doctor);
	}
	
	@Test
	void testCreateDoctor() {
		Patient patient1 = new Patient();
		patient1.setFirstName("Destiny");
		patient1.setLastName("Omamuli");
		patient1.setPhone("2344543");
		
		
		Insurance insurance = new Insurance();
		insurance.setProviderName("World Health Organization");
		insurance.setCopay(550d);
		
		patient1.setInsurance(insurance);
		
		Doctor doctor = doctorRepo.findById(1).get();
		System.out.println(doctor.getFirstName());
		
		List<Doctor> doctors = Arrays.asList(doctor);
		
		patient1.setDoctors(doctors);
		
		patientRepo.save(patient1);
	}*/
	
	@Test
	void testCreateAppointment() {
		Appointment appointment = new Appointment();
		Timestamp appointmentTime = new Timestamp(new Date().getTime());
		appointment.setAppointmentTime(appointmentTime);
		appointment.setReason("I have a tumor in my stomach");
		appointment.setStarted(true);
		
		Patient patient = patientRepo.findById(6).get();
		appointment.setPatient(patient );
		
		appointment.setDoctor(doctorRepo.findById(1).get());
		
		appointmentRepo.save(appointment);
	}

}
