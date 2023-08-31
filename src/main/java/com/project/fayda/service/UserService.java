package com.project.fayda.service;

import org.springframework.stereotype.Service;

import com.project.fayda.entity.Customer;
import com.project.fayda.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Customer save(Customer customer) {
        return userRepository.save(customer);
    }
}
