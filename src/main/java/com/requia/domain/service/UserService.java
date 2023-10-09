package com.requia.domain.service;

import com.requia.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);

}
