package tn.esprit.arctic.demo1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prixTotal;

    // Getters and Setters
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ChefCuisinier> chefCuisinier ;
    @OneToMany(mappedBy = "menu")
    private Set <Composant> composant ;
    @OneToMany(mappedBy = "menu")
    private Set<Commande> commande;
}