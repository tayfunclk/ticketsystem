package com.example.ticketsystem.controller;

import com.example.ticketsystem.model.Flight;
import com.example.ticketsystem.serice.FlightService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/getAll")
    public List<Flight> getAll() {
        return flightService.getAll();
    }

    @PostMapping("/add")
    public void addFlight(@ApiParam("Flight object ") @RequestBody Flight flight) {
        flightService.addFlight(flight);
    }


}
