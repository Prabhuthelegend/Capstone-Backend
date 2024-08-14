public interface AuthTokenService {
    String createToken(String username);
    boolean validateToken(String token);
}
