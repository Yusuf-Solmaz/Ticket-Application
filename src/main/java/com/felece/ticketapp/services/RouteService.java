package com.felece.ticketapp.services;

import com.felece.ticketapp.entities.Route;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface RouteService {
    Route saveRoute(Route route);
    List<Route> getAll();
    void deleteRoute(Long id);
    Route updateRoute(Long routeId,Route newRoute);
}
