package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo1.entities.Client;
import tn.esprit.arctic.demo1.entities.Commande;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepo extends JpaRepository<Commande, Long> {


    List<Commande> findByClientIdClient(Client Id) ;
    List<Commande> findByClientIdClientAndDateCommandeBetween (Long clientId, LocalDate startDate, LocalDate endDate);
    //List<Commande> findByDateCommandeBetweenOrderBytotalCommandeAndNoteAsc(LocalDate startDate, LocalDate endDate);

    List<Commande> findByDateCommandeBetweenOrderByTotalCommandeAscNoteAsc(
            LocalDate startDate,
            LocalDate endDate
    );


}
