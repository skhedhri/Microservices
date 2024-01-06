package org.sid.ref.Services;

import org.sid.ref.Metier.TicketMetier;
import org.sid.ref.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketRestController {
    @Autowired
    private TicketMetier ticketMetier;
    @RequestMapping(value = "/kitchen/ticket",method = RequestMethod.POST)
    public Ticket saveTicket(@RequestBody Ticket ticket){
        return ticketMetier.saveTicket(ticket);
    }
    @RequestMapping(value = "/kitchen/acceptTicket",method = RequestMethod.POST)
    public Ticket acceptTicket(@RequestBody Ticket ticket){
        return ticketMetier.acceptTicket(ticket);
    }
    @RequestMapping(value = "/kitchen/readyForPickUp",method = RequestMethod.POST)
    public Ticket readyForPickUp(@RequestBody Ticket ticket){
        return ticketMetier.readyForPickUp(ticket);
    }
}
