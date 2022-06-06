package com.agregio.repository;

import com.agregio.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository extends JpaRepository<Park, Long> {

}
