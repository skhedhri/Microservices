package org.sid.ref.Metier;

import org.sid.ref.Model.Ordre;

import java.util.List;

public interface OrderMetier {
    public Ordre saveOrder(Ordre order);
    public Ordre reviseOrder(Long id , Ordre order);
    public void deleteOrder(Long id);
    public List<Ordre> ORDERS();
    public Ordre cancelOrder(Ordre order);
}
