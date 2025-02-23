package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo1.entities.Restaurant;

import java.util.Date;
import java.util.List;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
    List<Restaurant>findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(Long capacite, Date localDate);


}
