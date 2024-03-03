package com.example.vehicules.Vehicules.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vehicule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marque;
    String modele;
    String annee;
    String couleur;
    String typeDeCarburant;
    String prix;
}
