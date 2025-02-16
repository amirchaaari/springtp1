package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.Commande;
import tn.esprit.arctic.demo1.repositories.CommandeRepo;
import java.util.List;

public class CommandeService implements ICommandeService {

    private final CommandeRepo commandeRepo;

    public CommandeService(CommandeRepo commandeRepo) {
        this.commandeRepo = commandeRepo;
    }

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
