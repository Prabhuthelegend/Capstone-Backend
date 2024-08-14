public interface RatingsService {
    Rating addRating(Long userId, Long doctorId, int rating, String comment);
    List<Rating> getRatingsByDoctorId(Long doctorId);
}
