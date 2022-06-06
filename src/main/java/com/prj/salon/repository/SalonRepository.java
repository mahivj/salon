package com.prj.salon.repository;

import com.prj.salon.model.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends JpaRepository <Salon, Long>{

}
