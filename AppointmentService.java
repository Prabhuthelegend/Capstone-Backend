public interface AppointmentService {
    Appointment createAppointment(Long userId, Long doctorId, Date appointmentDate, Time appointmentTime);
    List<Appointment> getAppointmentsByUserId(Long userId);
    List<Appointment> getAppointmentsByDoctorId(Long doctorId);
    void cancelAppointment(Long appointmentId);
}
