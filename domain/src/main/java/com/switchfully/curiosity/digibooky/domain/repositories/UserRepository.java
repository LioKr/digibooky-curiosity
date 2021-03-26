package com.switchfully.curiosity.digibooky.domain.repositories;

import com.switchfully.curiosity.digibooky.domain.entities.users.User;

import java.util.UUID;

public interface UserRepository {

    User createUser(User user);

    User getUserById(UUID userId);
}
