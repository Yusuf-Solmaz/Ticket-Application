package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.Ticket;
import com.felece.ticketapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
@CrossOrigin(origins = "*")
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/getAll")
    public List<Ticket> getAll(){
        return ticketService.getAll();
    }
    @PostMapping
    public Ticket save(@RequestBody Ticket ticket){
        return ticketService.saveTicket(ticket);
    }
}
