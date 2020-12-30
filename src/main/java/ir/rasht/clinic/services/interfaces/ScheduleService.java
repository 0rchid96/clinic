package ir.rasht.clinic.services.interfaces;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.domains.Schedule;
import ir.rasht.clinic.dto.DoctorDto;
import ir.rasht.clinic.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDto> getDoctorsSchedule(Doctor doctor);
    void saveSchedule(Schedule schedule);

}
