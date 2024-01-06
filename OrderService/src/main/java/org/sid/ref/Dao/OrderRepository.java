package org.sid.ref.Dao;

import org.sid.ref.Model.Ordre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Ordre,Long> {
}
