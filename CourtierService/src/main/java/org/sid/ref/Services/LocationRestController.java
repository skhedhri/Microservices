package org.sid.ref.Services;

import org.sid.ref.Metier.LocaltionMetier;
import org.sid.ref.Model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationRestController {
    @Autowired
    private LocaltionMetier locationMetier;
    @RequestMapping(value = "/courtier/courtiers/{id}",method = RequestMethod.PUT)
    public Location updateLocation(@PathVariable(name = "id") Long id, @RequestBody Location location){
        return locationMetier.updateLocation(id, location);
    }
}
