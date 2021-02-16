package repository;

import ticket.Ticket;

public class TicketRepository {

    private Ticket[] tickets = new Ticket[0];

    public void save(Ticket ticket) {
        int length = tickets.length+1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        tmp[length-1] = ticket;
        tickets = tmp;
    }

    public Ticket[] findAll() {
        return tickets;
    }

    public void delete(int id) {
        int length = tickets.length - 1;
        Ticket[] tmp = new Ticket[length];
        int index = 0;
        for(Ticket item:tickets) {
            if(item.getId() != id) {
                tmp[index] = item;
            }
        }
        tickets = tmp;
    }


}
