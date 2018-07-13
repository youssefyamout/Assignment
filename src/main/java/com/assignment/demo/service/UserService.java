package com.assignment.demo.service;

import com.assignment.demo.repository.UserRepository;
import com.assignment.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    private final
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }
}
