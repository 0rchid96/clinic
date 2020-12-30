package ir.rasht.clinic.services.implementations;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.dto.DoctorDto;
import ir.rasht.clinic.exceptions.ServiceException;
import ir.rasht.clinic.repositories.DoctorRepository;
import ir.rasht.clinic.services.interfaces.DoctorService;
import ir.rasht.clinic.utils.MessageUtil;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DoctorServiceImp implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final ModelMapper modelMapper;
    private final MessageUtil messageUtil;
    public DoctorServiceImp(DoctorRepository doctorRepository, ModelMapper modelMapper, MessageUtil messageUtil) {
        this.doctorRepository = doctorRepository;
        this.modelMapper = modelMapper;
        this.messageUtil = messageUtil;
    }

    @Override
    public List<DoctorDto> getAllDoctors() {
       List<Doctor> doctors = doctorRepository.findAll();
        List<DoctorDto> doctorDtoList = new ArrayList<>();
       for (Doctor doctor:doctors){
           doctorDtoList.add(modelMapper.map(doctor,DoctorDto.class));
       }
        return doctorDtoList;
    }

    @Override
    public Doctor getDoctorById(long doctorId) {
        return doctorRepository.findById(doctorId).orElseThrow(() -> new ServiceException(404, messageUtil.get("doctor.not.found")));
    }
}
