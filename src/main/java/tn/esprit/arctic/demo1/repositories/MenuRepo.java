package tn.esprit.arctic.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.arctic.demo1.entities.Menu;
import tn.esprit.arctic.demo1.entities.TypeMenu;

import java.util.List;

public interface MenuRepo extends JpaRepository<Menu, Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, double montant);
    @Query("SELECT m FROM Menu m ORDER BY m.typeMenu, m.prixTotal")
    List<Menu> findAllMenusOrderedByTypeAndPrice();


    @Query("SELECT DISTINCT m FROM Menu m " +
            "JOIN m.composant c " +
            "WHERE c.typeComposant = :typeComposant")
    List<Menu> findMenusByComposantType(@Param("typeComposant") String typeComposant);
    
}
