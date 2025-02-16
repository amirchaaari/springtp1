package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.Commande;
import java.util.List;

public interface ICommandeService {
    Commande saveCommande(Commande commande);
    Commande getCommandeById(Long id);
    List<Commande> getAllCommandes();
    Commande updateCommande(Long id, Commande commande);
    void deleteCommande(Long id);
    List<Commande> addCommandes(List<Commande> commandes);
}
