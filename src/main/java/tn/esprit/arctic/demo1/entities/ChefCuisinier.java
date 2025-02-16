package tn.esprit.arctic.demo1.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
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