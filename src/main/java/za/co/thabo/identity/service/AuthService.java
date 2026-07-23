package za.co.thabo.identity.service;

import org.springframework.stereotype.Service;
import za.co.thabo.identity.entity.User;
import za.co.thabo.identity.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }

}