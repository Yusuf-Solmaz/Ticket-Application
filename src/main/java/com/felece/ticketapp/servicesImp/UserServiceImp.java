package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.dtos.UserFilterDto;
import com.felece.ticketapp.entities.User;
import com.felece.ticketapp.repositories.UserRepository;
import com.felece.ticketapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(Long userId, User newUser) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()){
            User foundUser = user.get();
            foundUser.setName(newUser.getName());
            foundUser.setLastName(newUser.getLastName());
            foundUser.setPassword(newUser.getPassword());
            foundUser.setPhoneNumber(newUser.getPhoneNumber());
            foundUser.setIndividualMail(newUser.getIndividualMail());
            userRepository.save(foundUser);
            return foundUser;
        }
        else {
            System.out.println("Belirtilen id ile bağlantılı kullanıcı bulunamadı.");
            return null;

        }
    }

    @Override
    public UserFilterDto filterById(Long userId) {
        return userRepository.filterById(userId);
    }
}


