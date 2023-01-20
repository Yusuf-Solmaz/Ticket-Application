package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Route;
import com.felece.ticketapp.repositories.RouteRepository;
import com.felece.ticketapp.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImp implements RouteService {

    RouteRepository routeRepository;

    @Autowired
    public RouteServiceImp(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    public Route saveRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public List<Route> getAll() {
        return routeRepository.findAll();
    }
}
