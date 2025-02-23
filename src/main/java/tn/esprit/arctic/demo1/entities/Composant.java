package tn.esprit.arctic.demo1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;
    @OneToOne()
   private DetailComposant detailComposant;
    // Getters and Setters
    @ManyToOne()
    private Menu menu;
}
