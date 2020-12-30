package ir.rasht.clinic.controllers;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.dto.AppResponse;
import ir.rasht.clinic.dto.DoctorDto;
import ir.rasht.clinic.services.interfaces.DoctorService;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
@Log
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public ResponseEntity<AppResponse<List<DoctorDto>>> getDoctor(Pageable pageable){
        return ResponseEntity.ok(new AppResponse<>(doctorService.getAllDoctors()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppResponse<Doctor>> getDoctorById(@PathVariable String id){
        return ResponseEntity.ok(new AppResponse<>(doctorService.getDoctorById(Long.parseLong(id))));
    }

}
