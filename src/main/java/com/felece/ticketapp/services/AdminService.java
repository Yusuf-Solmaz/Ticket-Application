package com.felece.ticketapp.services;

import com.felece.ticketapp.entities.Admin;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface AdminService {
    Admin saveAdmin(Admin admin);
    List<Admin> getAll();
}
