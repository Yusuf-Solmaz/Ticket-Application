package com.felece.ticketapp.dtos;

import com.felece.ticketapp.entities.Status;
import com.felece.ticketapp.entities.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketActiveDto {
    private Long ticketId;
    private Date date;
    private String price;
    private Boolean isActive;
    private Status status;
    private Long userId;
    private Vehicle vehicle;

}
