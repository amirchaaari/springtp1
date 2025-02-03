package tn.esprit.arctic.demo1.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    // Getters and Setters
}
