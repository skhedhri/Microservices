package org.sid.ref.Metier;

import org.sid.ref.Dao.RestaurentRepository;
import org.sid.ref.Model.Menu;
import org.sid.ref.Model.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentMetierImpl implements RestaurentMetier {
    @Autowired
    private RestaurentRepository restaurentRepository;
    @Override
    public List<Restaurent> findAvailableRestaurants(String ville) {
        return restaurentRepository.getRestaurentsByCite(ville);
    }

    @Override
    public List<Menu> findRestaurantMenu(Long id) {
        Restaurent restaurent = restaurentRepository.getRestaurentsById(id);
        return (List<Menu>) restaurent.getMenus();
    }
}
