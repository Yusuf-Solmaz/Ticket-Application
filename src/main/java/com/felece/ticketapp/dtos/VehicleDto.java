package com.felece.ticketapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
    private Long id;
    private int numberOfEmptySeats;
    private String plateNumber;
    private String Brand;
    private boolean isActive =true;
}
