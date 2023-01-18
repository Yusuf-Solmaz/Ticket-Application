package com.felece.ticketapp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="allUsers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String lastName;
    String password;

    @OneToOne(mappedBy = "allUsers")
    private User user;

    @OneToOne(mappedBy = "allUsers")
    private Admin admin;
}
