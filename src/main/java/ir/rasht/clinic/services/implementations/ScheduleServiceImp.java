package ir.rasht.clinic.services.implementations;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.domains.Schedule;
import ir.rasht.clinic.dto.ScheduleDto;
import ir.rasht.clinic.repositories.ScheduleRepository;
import ir.rasht.clinic.services.interfaces.ScheduleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ScheduleServiceImp implements ScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final ModelMapper modelMapper;

    public ScheduleServiceImp(ScheduleRepository scheduleRepository, ModelMapper modelMapper) {
        this.scheduleRepository = scheduleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ScheduleDto> getDoctorsSchedule(Doctor doctor) {

        List<Schedule> schedules = scheduleRepository.getAllByDoctor(doctor);
        List<ScheduleDto> scheduleDtoList = new ArrayList<>();
        for (Schedule schedule:schedules){
            scheduleDtoList.add(modelMapper.map(schedule,ScheduleDto.class));
        }
        return scheduleDtoList;

    }

    @Override
    public void saveSchedule(Schedule schedule) {

    }


}
