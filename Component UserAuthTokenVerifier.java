@Component
public class UserAuthTokenVerifier {
    @Autowired
    private AuthTokenService authTokenService;

    public boolean verifyToken(String token) {
        return authTokenService.validateToken(token);
    }
}
