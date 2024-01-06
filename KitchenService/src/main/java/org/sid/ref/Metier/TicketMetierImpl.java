package org.sid.ref.Metier;

import org.sid.ref.Dao.TicketRepository;
import org.sid.ref.Model.StateEnum;
import org.sid.ref.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketMetierImpl implements TicketMetier{
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Long id, Ticket ticket) {
        ticket.setId(id);
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticket> TICKETS() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket cancelTicket(Ticket ticket) {
        ticket.setState(StateEnum.canceled);
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket acceptTicket(Ticket ticket) {
        ticket.setState(StateEnum.accepted);
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket readyForPickUp(Ticket ticket) {
        ticket.setState(StateEnum.ready);
        return ticketRepository.save(ticket);
    }
}
