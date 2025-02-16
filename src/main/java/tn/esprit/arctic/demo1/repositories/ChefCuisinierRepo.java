package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo1.entities.ChefCuisinier;
import tn.esprit.arctic.demo1.entities.Client;

public interface ChefCuisinierRepo extends JpaRepository<ChefCuisinier,Long> {
}
