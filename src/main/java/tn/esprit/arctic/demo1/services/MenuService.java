package tn.esprit.arctic.demo1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.demo1.entities.Menu;
import tn.esprit.arctic.demo1.repositories.MenuRepo;
import java.util.List;
@Service
@AllArgsConstructor
public class MenuService implements IMenuService {

    private  MenuRepo menuRepo;



    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepo.save(menu);
    }

    @Override
    public Menu getMenuById(Long id) {
        return menuRepo.findById(id).orElse(null);
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuRepo.findAll();
    }

    @Override
    public Menu updateMenu(Long id, Menu menu) {
        return menuRepo.save(menu);
    }

    @Override
    public void deleteMenu(Long id) {
        menuRepo.deleteById(id);
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return menuRepo.saveAll(menus);
    }
}
