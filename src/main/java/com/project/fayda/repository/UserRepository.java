package com.project.fayda.repository;

import com.project.fayda.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Customer, Integer> {

}
