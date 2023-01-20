package com.felece.ticketapp.services;

import com.felece.ticketapp.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserService {
    User saveUser(User user);
    List<User> getAll();
}
