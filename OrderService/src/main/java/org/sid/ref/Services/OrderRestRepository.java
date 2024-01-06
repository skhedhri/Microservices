package org.sid.ref.Services;

import org.sid.ref.Metier.OrderMetier;
import org.sid.ref.Model.Ordre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderRestRepository {
    @Autowired
    private OrderMetier orderMetier;
    @RequestMapping(value = "/order/orders",method = RequestMethod.POST)
    public Ordre saveOrder(@RequestBody Ordre order){
        return orderMetier.saveOrder(order);

    }
    @RequestMapping(value = "/order/orders", method = RequestMethod.GET)
    public List<Ordre> orders() {
        return orderMetier.ORDERS();
    }
    @RequestMapping(value = "/order/orders/{id}",method = RequestMethod.PUT)
    public Ordre updaterder(@PathVariable(name = "id") Long id, @RequestBody Ordre order){
        return orderMetier.reviseOrder(id, order);
    }
    @RequestMapping(value = "/order/orders/{id}",method = RequestMethod.DELETE)
    public void deleteOrder(@PathVariable(name = "id") Long id){
        orderMetier.deleteOrder(id);
    }
    @RequestMapping(value = "/order/reviseOrder",method = RequestMethod.POST)
    public Ordre reviseOrder(@RequestBody Ordre order){
        return orderMetier.reviseOrder(order.getId(),order);

    }
}
