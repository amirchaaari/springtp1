package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo1.entities.DetailComposant;

public interface DetailComposantRepo extends JpaRepository<DetailComposant, Long> {

}
