package com.felece.ticketapp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
}