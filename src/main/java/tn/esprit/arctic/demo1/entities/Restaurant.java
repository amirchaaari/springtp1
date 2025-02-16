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
