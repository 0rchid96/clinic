package ir.rasht.clinic.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "doctor", orphanRemoval = true)
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "doctor", orphanRemoval = true)
    private List<Schedule> schedules;

}
