package tn.esprit.arctic.demo1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.demo1.entities.Composant;
import tn.esprit.arctic.demo1.repositories.ComposantRepo;
import java.util.List;
@Service
@AllArgsConstructor

public class ComposantService implements IComposantService {

    private  ComposantRepo composantRepo;


    @Override
    public Composant saveComposant(Composant composant) {
        return composantRepo.save(composant);
    }

    @Override
    public Composant getComposantById(Long id) {
        return composantRepo.findById(id).orElse(null);
    }

    @Override
    public List<Composant> getAllComposants() {
        return composantRepo.findAll();
    }

    @Override
    public Composant updateComposant(Long id, Composant composant) {
        return composantRepo.save(composant);
    }

    @Override
    public void deleteComposant(Long id) {
        composantRepo.deleteById(id);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        return composantRepo.saveAll(composants);
    }
}
