package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.repositories.RouteRepository;
import com.felece.ticketapp.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImp implements RouteService {

    RouteRepository routeRepository;

    @Autowired
    public RouteServiceImp(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }
}
