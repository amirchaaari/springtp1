package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.Menu;
import java.util.List;

public interface IMenuService {
    Menu saveMenu(Menu menu);
    Menu getMenuById(Long id);
    List<Menu> getAllMenus();
    Menu updateMenu(Long id, Menu menu);
    void deleteMenu(Long id);
    List<Menu> addMenus(List<Menu> menus);
}
