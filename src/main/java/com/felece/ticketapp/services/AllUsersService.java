package com.felece.ticketapp.services;


import com.felece.ticketapp.entities.AllUsers;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface AllUsersService {
    AllUsers saveAllUsers(AllUsers allUsers);
    List<AllUsers> getAll();
}
