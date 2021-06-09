package com.enset.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor  @ToString

public class Place {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_place;
    private int num_salle;
    private double longitude_plce,latitide_plce, altitude_plce;
    @ManyToOne
    private  Salle salle;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket>tickets;
}