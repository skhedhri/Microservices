package org.sid.ref.Dao;

import org.sid.ref.Model.LineItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemsRepository extends JpaRepository<LineItems,Long> {
}
