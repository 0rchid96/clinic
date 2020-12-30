package ir.rasht.clinic.services.interfaces;

import ir.rasht.clinic.domains.Appointment;
import ir.rasht.clinic.domains.Doctor;
import ir.rasht.clinic.domains.Patient;

import java.util.Date;
import java.util.List;

public interface AppointmentService {
    void saveAppointment(Appointment appointment);
    void deleteAppointment(Appointment appointment);
    List<Appointment> getDoctorsAppointments(Doctor doctor);
    List<Appointment> getPatientsAppointments(Patient patient);
    Appointment createAppointment(Doctor doctor, Patient patient, Date date,long startTime,long finishTime);

}
