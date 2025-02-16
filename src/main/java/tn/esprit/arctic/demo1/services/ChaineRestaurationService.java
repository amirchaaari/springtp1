package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.ChaineRestauration;
import tn.esprit.arctic.demo1.repositories.ChaineRestaurationRepo;
import java.util.List;

public class ChaineRestaurationService implements IChaineRestaurationService {

    private final ChaineRestaurationRepo chaineRestaurationRepo;

    public ChaineRestaurationService(ChaineRestaurationRepo chaineRestaurationRepo) {
        this.chaineRestaurationRepo = chaineRestaurationRepo;
    }

    @Override
    public ChaineRestauration saveChaineRestauration(ChaineRestauration chaineRestauration) {
        return chaineRestaurationRepo.save(chaineRestauration);
    }

    @Override
    public ChaineRestauration getChaineRestaurationById(Long id) {
        return chaineRestaurationRepo.findById(id).orElse(null);
    }

    @Override
    public List<ChaineRestauration> getAllChaineRestaurations() {
        return chaineRestaurationRepo.findAll();
    }

    @Override
    public ChaineRestauration updateChaineRestauration(Long id, ChaineRestauration chaineRestauration) {
        return chaineRestaurationRepo.save(chaineRestauration);
    }

    @Override
    public void deleteChaineRestauration(Long id) {
        chaineRestaurationRepo.deleteById(id);
    }

    @Override
    public List<ChaineRestauration> addChaineRestaurations(List<ChaineRestauration> chaineRestaurations) {
        return chaineRestaurationRepo.saveAll(chaineRestaurations);
    }
}
