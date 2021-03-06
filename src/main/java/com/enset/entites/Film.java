package com.enset.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Film implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_film;
    @Column(length=50)
    private String nom_film;
    @Column(length=45)
    private String realisateur;
    private Date dateSortie_film;
    private double durre_film;
    private String photo_film;
    @OneToMany(mappedBy = "film")
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//spécifier la recherche pour spring data REST
    private Collection<ProjectionCin> projections;
    @ManyToOne()
    private  Categorie categorie;

}
