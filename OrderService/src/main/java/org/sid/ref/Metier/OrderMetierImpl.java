package org.sid.ref.Metier;

import com.netflix.discovery.converters.Auto;
import org.sid.ref.Dao.OrderRepository;
import org.sid.ref.Model.Ordre;
import org.sid.ref.Model.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMetierImpl implements OrderMetier{
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Ordre saveOrder(Ordre order) {
        return orderRepository.save(order);
    }

    @Override
    public Ordre reviseOrder(Long id, Ordre order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Ordre> ORDERS() {
        return orderRepository.findAll();
    }

    @Override
    public Ordre cancelOrder(Ordre order) {
        order.setState(StateEnum.canceled);
        return orderRepository.save(order);
    }

}
