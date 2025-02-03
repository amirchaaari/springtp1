package tn.esprit.arctic.demo1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;
    @ManyToOne(cascade =CascadeType.ALL)
    ChaineRestauration chaineRestauration;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> menu;
}
