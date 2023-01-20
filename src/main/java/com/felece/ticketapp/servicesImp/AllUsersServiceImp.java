package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.repositories.AllUsersRepository;
import com.felece.ticketapp.services.AllUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllUsersServiceImp implements AllUsersService {

    AllUsersRepository allUsersRepository;

    @Autowired
    public AllUsersServiceImp(AllUsersRepository allUsersRepository) {
        this.allUsersRepository = allUsersRepository;
    }
}
