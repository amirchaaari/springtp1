package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.DetailComposant;
import java.util.List;

public interface IDetailComposantService {
    DetailComposant saveDetailComposant(DetailComposant detailComposant);
    DetailComposant getDetailComposantById(Long id);
    List<DetailComposant> getAllDetailComposants();
    DetailComposant updateDetailComposant(Long id, DetailComposant detailComposant);
    void deleteDetailComposant(Long id);
    List<DetailComposant> addDetailComposants(List<DetailComposant> detailComposants);
}
