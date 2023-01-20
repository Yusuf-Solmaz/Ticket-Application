package com.felece.ticketapp.repositories;

import com.felece.ticketapp.entities.Route;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("route")
public interface RouteRepository extends JpaRepository<Route,Long> {
}
