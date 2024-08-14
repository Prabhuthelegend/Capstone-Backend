@Service
public class AuthTokenServiceImpl implements AuthTokenService {
    private final String SECRET_KEY = "your-secret-key";

    @Override
    public String createToken(String username) {
        // Token creation logic
    }

    @Override
    public boolean validateToken(String token) {
        // Token validation logic
    }
}
