package tn.esprit.arctic.demo1.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @OneToOne()
   private DetailComposant detailComposant;
    // Getters and Setters
    @ManyToOne()
    private Menu menu;
}
