package com.example.SpringEjercicio4.repositories;

import com.example.SpringEjercicio4.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
