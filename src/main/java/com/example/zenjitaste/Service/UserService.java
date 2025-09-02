package com.example.zenjitaste.Service;


import com.example.zenjitaste.Models.User;
import com.example.zenjitaste.Repository.UserRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // Automatically injects final fields
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        // Here you would add business logic like password encryption
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // Additional methods for user-related business logic can be added here
}