package com.ticket.dao;

import org.springframework.data.repository.CrudRepository;

import com.ticket.entity.Ticket;
public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
