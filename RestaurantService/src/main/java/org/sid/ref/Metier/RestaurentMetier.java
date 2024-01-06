package org.sid.ref.Metier;

import org.sid.ref.Model.Menu;
import org.sid.ref.Model.Restaurent;

import java.util.List;

public interface RestaurentMetier {
    public List<Restaurent> findAvailableRestaurants(String ville);
    public List<Menu> findRestaurantMenu(Long id);
}
