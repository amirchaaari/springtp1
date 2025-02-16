package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.Restaurant;
import java.util.List;

public interface IRestaurantService {
    Restaurant saveRestaurant(Restaurant restaurant);
    Restaurant getRestaurantById(Long id);
    List<Restaurant> getAllRestaurants();
    Restaurant updateRestaurant(Long id, Restaurant restaurant);
    void deleteRestaurant(Long id);
    List<Restaurant> addRestaurants(List<Restaurant> restaurants);
}
