package ir.rasht.clinic.repositories;

import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
    List<Schedule> getAllByDoctor(Doctor doctor);
}
