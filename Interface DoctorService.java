public interface DoctorService {
    Doctor createDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    Doctor updateDoctor(Long doctorId, Doctor updatedDoctor);
    void deleteDoctor(Long doctorId);
}
