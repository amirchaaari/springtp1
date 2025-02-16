package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.ChefCuisinier;
import java.util.List;

public interface IChefCuisinierService {
    ChefCuisinier saveChefCuisinier(ChefCuisinier chefCuisinier);
    ChefCuisinier getChefCuisinierById(Long id);
    List<ChefCuisinier> getAllChefCuisiniers();
    ChefCuisinier updateChefCuisinier(Long id, ChefCuisinier chefCuisinier);
    void deleteChefCuisinier(Long id);
    List<ChefCuisinier> addChefCuisiniers(List<ChefCuisinier> chefCuisiniers);
}
