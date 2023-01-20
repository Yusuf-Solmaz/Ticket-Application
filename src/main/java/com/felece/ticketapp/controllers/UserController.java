package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.User;
import com.felece.ticketapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.saveUser(user);
    }
}
