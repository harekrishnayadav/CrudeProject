package com.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticket.entity.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
