package com.LaDev.fiscalizaMaisJp.service;

import com.LaDev.fiscalizaMaisJp.model.User;
import com.LaDev.fiscalizaMaisJp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    User save(User user);

    List<User> findAll();

    User findById(UUID id);

    User update(UUID id, User user);

    void delete(UUID id);
}
