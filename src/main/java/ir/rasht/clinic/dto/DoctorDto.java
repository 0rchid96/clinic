package ir.rasht.clinic.dto;

import ir.rasht.clinic.domains.Appointment;
import ir.rasht.clinic.domains.Schedule;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class DoctorDto implements Serializable {

    private long id;

    private String firstName;

    private String lastName;


    private List<Appointment> appointments;

    private List<Schedule> schedules;

}
