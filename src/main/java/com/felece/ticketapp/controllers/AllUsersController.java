package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.AllUsers;
import com.felece.ticketapp.services.AllUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allUsers")
@CrossOrigin(origins = "*")
public class AllUsersController {

    private AllUsersService allUsersService;

    @Autowired
    public AllUsersController(AllUsersService allUsersService) {
        this.allUsersService = allUsersService;
    }


    @GetMapping("/getAll")
    public List<AllUsers> getAll(){
        return allUsersService.getAll();
    }


}
