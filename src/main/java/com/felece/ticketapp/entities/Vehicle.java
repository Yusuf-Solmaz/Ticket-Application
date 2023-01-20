package com.felece.ticketapp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import java.util.List;


@Table(name = "vehicle")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private int numberOfEmptySeats;
    private String plateNumber;
    private String Brand;
    private boolean isActive =true;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<Ticket> tickets;
}
