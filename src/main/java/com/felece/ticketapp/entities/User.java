package com.felece.ticketapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class User extends AllUsers{

    private String individualMail;
    private String phoneNumber;



    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<Ticket> tickets;
}
