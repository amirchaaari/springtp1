package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.Restaurant;
import tn.esprit.arctic.demo1.repositories.RestaurantRepo;
import java.util.List;

public class RestaurantService implements IRestaurantService {

    private final RestaurantRepo restaurantRepo;

    public RestaurantService(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        return restaurantRepo.findById(id).orElse(null);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepo.deleteById(id);
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants) {
        return restaurantRepo.saveAll(restaurants);
    }
}
