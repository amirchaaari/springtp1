package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.ChaineRestauration;
import java.util.List;

public interface IChaineRestaurationService {
    ChaineRestauration saveChaineRestauration(ChaineRestauration chaineRestauration);
    ChaineRestauration getChaineRestaurationById(Long id);
    List<ChaineRestauration> getAllChaineRestaurations();
    ChaineRestauration updateChaineRestauration(Long id, ChaineRestauration chaineRestauration);
    void deleteChaineRestauration(Long id);
    List<ChaineRestauration> addChaineRestaurations(List<ChaineRestauration> chaineRestaurations);
}
