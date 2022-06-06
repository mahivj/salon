package com.prj.salon.controller;

import com.prj.salon.model.Salon;
import com.prj.salon.repository.SalonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salon")
@CrossOrigin("http://localhost:3000/")
@Slf4j

public class SalonController {

    @Autowired
    SalonRepository salonRepository;

    @GetMapping("/all")
    List<Salon> getSalons() {
        log.info("inside getSalons () of controller");
        return salonRepository.findAll();

    }

    @PostMapping("/save")
    Salon saveSalon(@RequestBody Salon salon) {
        log.info("inside save () of controller", salon);
        return salonRepository.save(salon);
    }

}
