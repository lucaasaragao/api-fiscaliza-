package com.LaDev.fiscalizaMaisJp.service;

import com.LaDev.fiscalizaMaisJp.model.User;
import com.LaDev.fiscalizaMaisJp.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findById(UUID id) {
        return null;
    }

    @Override
    public User update(UUID id, User user) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
