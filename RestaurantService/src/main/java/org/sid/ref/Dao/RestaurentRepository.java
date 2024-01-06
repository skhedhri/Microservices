package org.sid.ref.Dao;

import org.sid.ref.Model.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurentRepository extends JpaRepository<Restaurent,Long> {
    public List<Restaurent> getRestaurentsByCite(String cite);
    public Restaurent getRestaurentsById(Long id);
}
