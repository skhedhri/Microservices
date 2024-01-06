package org.sid.ref.Metier;

import org.sid.ref.Model.Ticket;

import java.util.List;

public interface TicketMetier {
    public Ticket saveTicket(Ticket ticket);
    public Ticket updateTicket(Long id , Ticket ticket);
    public void deleteTicket(Long id);
    public List<Ticket> TICKETS();
    public Ticket cancelTicket(Ticket ticket);
    public Ticket acceptTicket(Ticket ticket);
    public Ticket readyForPickUp(Ticket ticket);

}
