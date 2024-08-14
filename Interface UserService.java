public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User updateUser(Long userId, User user);
    void deleteUser(Long userId);
}
