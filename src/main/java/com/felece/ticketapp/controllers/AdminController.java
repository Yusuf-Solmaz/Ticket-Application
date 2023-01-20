package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.Admin;
import com.felece.ticketapp.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
@CrossOrigin(origins = "*")
public class AdminController {
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/getAll")
    public List<Admin> getAll(){
        return adminService.getAll();
    }

    @PostMapping
    public  Admin save(@RequestBody Admin admin){
        return adminService.saveAdmin(admin);
    }

}
