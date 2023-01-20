package com.felece.ticketapp.controllers;

import com.felece.ticketapp.services.AllUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allUsers")
@CrossOrigin(origins = "*")
public class AllUsersController {

    private AllUsersService allUsersService;

    @Autowired
    public AllUsersController(AllUsersService allUsersService) {
        this.allUsersService = allUsersService;
    }
}
