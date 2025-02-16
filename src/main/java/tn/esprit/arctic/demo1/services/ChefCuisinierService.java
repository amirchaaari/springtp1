package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.ChefCuisinier;
import tn.esprit.arctic.demo1.repositories.ChefCuisinierRepo;
import java.util.List;

public class ChefCuisinierService implements IChefCuisinierService {

    private final ChefCuisinierRepo chefCuisinierRepo;

    public ChefCuisinierService(ChefCuisinierRepo chefCuisinierRepo) {
        this.chefCuisinierRepo = chefCuisinierRepo;
    }

    @Override
    public ChefCuisinier saveChefCuisinier(ChefCuisinier chefCuisinier) {
        return chefCuisinierRepo.save(chefCuisinier);
    }

    @Override
    public ChefCuisinier getChefCuisinierById(Long id) {
        return chefCuisinierRepo.findById(id).orElse(null);
    }

    @Override
    public List<ChefCuisinier> getAllChefCuisiniers() {
        return chefCuisinierRepo.findAll();
    }

    @Override
    public ChefCuisinier updateChefCuisinier(Long id, ChefCuisinier chefCuisinier) {
        return chefCuisinierRepo.save(chefCuisinier);
    }

    @Override
    public void deleteChefCuisinier(Long id) {
        chefCuisinierRepo.deleteById(id);
    }

    @Override
    public List<ChefCuisinier> addChefCuisiniers(List<ChefCuisinier> chefCuisiniers) {
        return chefCuisinierRepo.saveAll(chefCuisiniers);
    }
}
