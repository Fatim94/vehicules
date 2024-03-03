package com.example.vehicules.Vehicules.repositories;

import com.example.vehicules.Vehicules.models.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
