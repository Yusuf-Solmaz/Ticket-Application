package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.Route;
import com.felece.ticketapp.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
@CrossOrigin(origins = "*")
public class RouteController {
    private RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/getAll")
    public List<Route> getAll(){
        return routeService.getAll();
    }

    @PostMapping
    public Route save(@RequestBody Route route){
        return routeService.saveRoute(route);
    }
}
