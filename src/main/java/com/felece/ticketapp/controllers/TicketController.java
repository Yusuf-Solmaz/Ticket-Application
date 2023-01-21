package com.felece.ticketapp.controllers;

import com.felece.ticketapp.dtos.TicketFilterDto;
import com.felece.ticketapp.entities.Ticket;
import com.felece.ticketapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @DeleteMapping
    public void delete(@RequestParam Long id){
        ticketService.deleteTicket(id);
    }

    @GetMapping("/filter")
    public List<TicketFilterDto> getFilterAll(@RequestParam Long userId){
        return ticketService.filterByUserId(userId);
    }

    @GetMapping
    public List<Ticket> getAllTickets(@RequestParam Optional<Long> userId){
        return ticketService.getAllTickets(userId);
    }
}
