package tn.esprit.arctic.demo1.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "chefCuisinier")
    private Set<Menu> menu ;

    // Getters and Setters
}