package com.vasthierarchy.db.resource;

import com.vasthierarchy.db.model.Users;
import com.vasthierarchy.db.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vast/reportingchain")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/get")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/post")
    public List<Users> persist(@RequestBody final Users users) {
        usersRepository.save(users);
        return usersRepository.findAll();
    }
}