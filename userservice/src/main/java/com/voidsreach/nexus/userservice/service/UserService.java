package com.voidsreach.nexus.userservice.service;

import com.voidsreach.nexus.userservice.model.UserRegistrationRequest;
import com.voidsreach.nexus.userservice.model.UserResponse;
import com.voidsreach.nexus.userservice.repository.UserEntity;
import com.voidsreach.nexus.userservice.repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(
            @NotNull final UserRepository userRepository
    ) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserResponse registerUser(@NonNull UserRegistrationRequest request) {
        UserEntity user = new UserEntity();
        user.setUsername(request.username());
        user.setEmail(request.email());
        // todo password
        user.setRank("DEFAULT");

        UserEntity savedUser = userRepository.save(user);
        return new UserResponse(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail());
    }

}
