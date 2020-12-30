package ir.rasht.clinic.repositories;

import ir.rasht.clinic.domains.Appointment;
import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.domains.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    List<Appointment> findAllByDoctor(Doctor doctor);
    List<Appointment> findAllByPatient(Patient patient);
    void deleteAppointmentById(long id);

}
