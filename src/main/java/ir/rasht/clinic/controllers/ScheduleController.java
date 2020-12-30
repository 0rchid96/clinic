package ir.rasht.clinic.controllers;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.dto.AppResponse;
import ir.rasht.clinic.dto.ScheduleDto;
import ir.rasht.clinic.services.interfaces.DoctorService;
import ir.rasht.clinic.services.interfaces.ScheduleService;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schedules")
@Log
public class ScheduleController {

    private final ScheduleService scheduleService;
    private final DoctorService doctorService;

    public ScheduleController(ScheduleService scheduleService, DoctorService doctorService) {
        this.scheduleService = scheduleService;
        this.doctorService = doctorService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<AppResponse<List<ScheduleDto>>> getSchedulesforDoctor(@PathVariable String id){
        return ResponseEntity.ok(new AppResponse<>(scheduleService.getDoctorsSchedule(doctorService.getDoctorById(Long.parseLong(id)))));
    }

}
