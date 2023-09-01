package com.project.fayda.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.fayda.entity.Customer;
import com.project.fayda.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "Hello";
    }

    // @GetMapping("/blog/{id}")
    // public User show(@PathVariable String id) {
    // int blogId = Integer.parseInt(id);
    // if(blogId==null)
    // throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    // return userRepository.findOne(id);
    // }

    @PostMapping("/registerUser")
    public Customer create(@RequestBody @Valid Map<String, String> body) {
        String full_name = body.get("full_name");
        String full_name_et = body.get("full_name_et");
        String nationality = body.get("nationality");
        String gender = body.get("gender");
        String date_of_birth = body.get("date_of_birth");
        String region = body.get("region");
        String zone = body.get("zone");
        String sub_city = body.get("sub_city");
        String woreda = body.get("woreda");
        String kebele = body.get("kebele");
        String phone_number = body.get("phone_number");
        return userService
                .save(new Customer(full_name, full_name_et, nationality, gender, date_of_birth, region, zone,
                        sub_city, woreda, kebele, phone_number));
    }
}
