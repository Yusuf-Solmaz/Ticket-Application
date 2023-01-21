package com.felece.ticketapp.dtos;

import com.felece.ticketapp.entities.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketFilterDto {
    private Long ticketId;
    private Date date;
    private String price;
    private Boolean isActive;
    private Status status;
    private Long userId;
    private Long vehicleId;
}
