package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Admin;
import com.felece.ticketapp.repositories.AdminRepository;
import com.felece.ticketapp.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    AdminRepository adminRepository;

    @Autowired
    public AdminServiceImp(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }
}
