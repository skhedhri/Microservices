package org.sid.ref.Services;

import com.netflix.discovery.converters.Auto;
import org.sid.ref.Metier.RestaurentMetier;
import org.sid.ref.Model.Menu;
import org.sid.ref.Model.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurentRestController {
    @Autowired
    private RestaurentMetier restaurentMetier;
    @RequestMapping(value = "/restaurent/findAvailableRestaurants",method = RequestMethod.GET)
    public List<Restaurent> findAvailableRestaurants(@RequestParam String ville){
        return restaurentMetier.findAvailableRestaurants(ville);
    }
    @RequestMapping(value = "/restaurent/findRestaurantMenu/{id}",method = RequestMethod.GET)
    public List<Menu> findRestaurantMenu(@PathVariable(name = "id") Long id ){
        return restaurentMetier.findRestaurantMenu(id);
    }
}
