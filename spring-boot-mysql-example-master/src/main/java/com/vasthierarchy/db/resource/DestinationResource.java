package com.vasthierarchy.db.resource;

import com.vasthierarchy.db.model.Destination;
import com.vasthierarchy.db.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vast/reportingchain/destination")
public class DestinationResource {

    @Autowired
    DestinationRepository destinationRepository;

    @GetMapping(value = "/get")
    public List<Destination> getAll() {
        return destinationRepository.findAll();
    }

    @PostMapping(value = "/post")
    public List<Destination> persist(@RequestBody final Destination destination) {
        destinationRepository.save(destination);
        return destinationRepository.findAll();
    }
}