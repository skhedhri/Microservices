package org.sid.ref.Dao;

import org.sid.ref.Model.OrderLineItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems,Long> {
}
