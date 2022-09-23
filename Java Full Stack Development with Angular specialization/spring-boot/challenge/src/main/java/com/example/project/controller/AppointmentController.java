package com.example.project.controller;

import com.example.project.Model.Appointment;
import com.example.project.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("register")
    public ResponseEntity<Appointment> registerAppointment(@RequestBody Appointment appointment){
        return ResponseEntity.ok(appointmentService.save(appointment));
    }

}
