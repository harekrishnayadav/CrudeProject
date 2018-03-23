package com.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.entity.Ticket;
import com.ticket.services.TicketService;

@RestController
@RequestMapping(value = "/api/ticket")
public class TicketController {
	@Autowired
	private TicketService service;

	@PostMapping(value = "/create")
	public Ticket createTicket(Ticket ticket) {
		return service.createTicket(ticket);

	}

	@GetMapping(value="/ticket/ticketid")
     public Ticket getTicketById(@PathVariable("ticketid") Integer ticketid) {
		return service.getTicketById(ticketid);
    	 
     }
}
