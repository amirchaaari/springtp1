package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo1.entities.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {

}
