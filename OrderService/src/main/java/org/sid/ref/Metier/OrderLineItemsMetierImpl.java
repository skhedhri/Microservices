package org.sid.ref.Metier;

import com.netflix.discovery.converters.Auto;
import org.sid.ref.Dao.OrderLineItemsRepository;
import org.sid.ref.Dao.OrderRepository;
import org.sid.ref.Model.Order;
import org.sid.ref.Model.OrderLineItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineItemsMetierImpl implements OrderLineItemsMetier {
    @Autowired
    private OrderLineItemsRepository orderLineItemsRepository;


    @Override
    public OrderLineItems saveOrderLineItems(OrderLineItems orderLineItems) {
        return orderLineItemsRepository.save(orderLineItems);
    }

    @Override
    public OrderLineItems updateOrderLineItems(Long id, OrderLineItems orderLineItems) {
        orderLineItems.setId(id);
        return orderLineItemsRepository.save(orderLineItems);
    }

    @Override
    public void deleteOrderLineItems(Long id) {
        orderLineItemsRepository.deleteById(id);
    }

    @Override
    public List<OrderLineItems> ORDER_LINE_ITEMS() {
        return orderLineItemsRepository.findAll();
    }
}
