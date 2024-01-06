package org.sid.ref.Metier;

import org.sid.ref.Model.OrderLineItems;

import java.util.List;

public interface OrderLineItemsMetier {
    public OrderLineItems saveOrderLineItems(OrderLineItems orderLineItems);
    public OrderLineItems updateOrderLineItems(Long id , OrderLineItems orderLineItems);
    public void deleteOrderLineItems(Long id);
    public List<OrderLineItems> ORDER_LINE_ITEMS();
}
