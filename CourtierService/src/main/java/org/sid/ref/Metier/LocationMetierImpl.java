package org.sid.ref.Metier;

import org.sid.ref.Dao.LocationRepository;
import org.sid.ref.Model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationMetierImpl implements LocaltionMetier{
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public Location updateLocation(Long id, Location location) {
        location.setId(id);
        return locationRepository.save(location);
    }
}
