package ir.rasht.clinic.domains;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Data
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Column
    private Instant startTime;

    @Column
    private Instant finishTime;
}
