@Service
public class RatingsServiceImpl implements RatingsService {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Rating addRating(Long userId, Long doctorId, int rating, String comment) {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found"));
        Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new RuntimeException("Doctor not found"));

        Rating ratingEntity = new Rating();
        ratingEntity.setUser(user);
        ratingEntity.setDoctor(doctor);
        ratingEntity.setRating(rating);
        ratingEntity.setComment(comment);
        ratingEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        return ratingRepository.save(ratingEntity);
    }

    @Override
    public List<Rating> getRatingsByDoctorId(Long doctorId) {
        return ratingRepository.findByDoctorId(doctorId);
    }
}
