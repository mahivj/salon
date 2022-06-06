package com.prj.salon;

import com.prj.salon.model.Salon;
import com.prj.salon.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalonBookingApplication implements CommandLineRunner {

    @Autowired
    private SalonRepository salonRepository;

    public static void main(String[] args) {
        SpringApplication.run(SalonBookingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        salonRepository.save(new Salon("Trim Barber", "Trim", "0894444"));
        salonRepository.save(new Salon("Crew & Barber", "Nicebrook", "0892222"));
        salonRepository.save(new Salon("Cut & Fade Salon", "Naven", "0896666"));
    }
}
