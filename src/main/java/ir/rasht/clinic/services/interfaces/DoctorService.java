package ir.rasht.clinic.services.interfaces;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.dto.DoctorDto;

import java.util.List;

public interface DoctorService {
    List<DoctorDto> getAllDoctors();
    Doctor getDoctorById(long doctorId);

}
