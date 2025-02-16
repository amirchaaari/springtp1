package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.DetailComposant;
import tn.esprit.arctic.demo1.repositories.DetailComposantRepo;
import java.util.List;

public class DetailComposantService implements IDetailComposantService {

    private final DetailComposantRepo detailComposantRepo;

    public DetailComposantService(DetailComposantRepo detailComposantRepo) {
        this.detailComposantRepo = detailComposantRepo;
    }

    @Override
    public DetailComposant saveDetailComposant(DetailComposant detailComposant) {
        return detailComposantRepo.save(detailComposant);
    }

    @Override
    public DetailComposant getDetailComposantById(Long id) {
        return detailComposantRepo.findById(id).orElse(null);
    }

    @Override
    public List<DetailComposant> getAllDetailComposants() {
        return detailComposantRepo.findAll();
    }

    @Override
    public DetailComposant updateDetailComposant(Long id, DetailComposant detailComposant) {
        return detailComposantRepo.save(detailComposant);
    }

    @Override
    public void deleteDetailComposant(Long id) {
        detailComposantRepo.deleteById(id);
    }

    @Override
    public List<DetailComposant> addDetailComposants(List<DetailComposant> detailComposants) {
        return detailComposantRepo.saveAll(detailComposants);
    }
}
