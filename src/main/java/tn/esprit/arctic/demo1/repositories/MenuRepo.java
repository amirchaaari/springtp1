package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo1.entities.Menu;

public interface MenuRepo extends JpaRepository<Menu, Long> {

}
