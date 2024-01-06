package org.sid.ref.Metier;

import org.sid.ref.Model.LineItems;
import org.sid.ref.Model.Ticket;

import java.util.List;

public interface LineItemsMetier {
    public Ticket saveTLineItems(LineItems lineItems);
    public Ticket updateLineItems(Long id , LineItems lineItems);
    public void deleteLineItems(Long id);
    public List<LineItems> LINE_ITEMS();
    public Ticket cancelLineItems(LineItems lineItems);
}
