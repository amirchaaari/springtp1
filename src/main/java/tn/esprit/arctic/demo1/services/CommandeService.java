package tn.esprit.arctic.demo1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.demo1.entities.Commande;
import tn.esprit.arctic.demo1.repositories.CommandeRepo;
import java.util.List;
@Service
@AllArgsConstructor

public class CommandeService implements ICommandeService {

    private  CommandeRepo commandeRepo;


    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepo.save(commande);
    }

    @Override
    public Commande getCommandeById(Long id) {
        return commandeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepo.findAll();
    }

    @Override
    public Commande updateCommande(Long id, Commande commande) {
        return commandeRepo.save(commande);
    }

    @Override
    public void deleteCommande(Long id) {
        commandeRepo.deleteById(id);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return commandeRepo.saveAll(commandes);
    }
}
