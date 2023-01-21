package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Route;
import com.felece.ticketapp.repositories.RouteRepository;
import com.felece.ticketapp.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }

    @Override
    public Route updateRoute(Long routeId, Route newRoute) {
        Optional<Route> route = routeRepository.findById(routeId);
        if (route.isPresent()){
            Route foundRoute = route.get();
            foundRoute.setArrival(newRoute.getArrival());
            foundRoute.setDeparture(newRoute.getDeparture());
            routeRepository.save(foundRoute);
            return foundRoute;
        }
        else {
            System.out.println("Belirtilen id ile bağlantılı rota bulunamadı");
            return null;
        }
    }
}
