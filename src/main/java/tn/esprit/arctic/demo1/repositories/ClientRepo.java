package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.arctic.demo1.entities.Client;

public interface ClientRepo extends JpaRepository<Client,Long> {



}
