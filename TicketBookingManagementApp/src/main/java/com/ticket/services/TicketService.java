package com.ticket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.dao.TicketDao;
import com.ticket.entity.Ticket;

@Service
public class TicketService {
	@Autowired
	private TicketDao dao;

	public Ticket createTicket(Ticket ticket) {

		return dao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketid) {
	
		return dao;
	}

      
	

}
