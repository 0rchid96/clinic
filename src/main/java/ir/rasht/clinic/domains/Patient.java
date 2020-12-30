package ir.rasht.clinic.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "patient", orphanRemoval = true)
    private List<Appointment> appointments;
}
