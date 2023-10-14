package com.requia.domain.service;

import com.requia.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();


    User findById(Long id);

    User update(Long id, User user);
    User create(User userToCreate);
    void deleteById(Long id);

}
