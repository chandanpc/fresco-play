package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Appointment;
import com.example.project.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    public void deleteAppointment(String appintId) {
        Optional<Appointment> app=appointmentRepository.findAll().stream().filter(a -> a.getBooking_id().equals(appintId)).findFirst();
        appointmentRepository.delete(app.get());
    }

    public List<Appointment> getAllAppointments() {

        return appointmentRepository.findAll();
    }
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}
