package tn.esprit.arctic.demo1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;
    private Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private Set<Commande> commande;
}
