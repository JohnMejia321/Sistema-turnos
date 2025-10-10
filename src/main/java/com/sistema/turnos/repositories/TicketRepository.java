package com.sistema.turnos.repositories;

import java.util.List;
import java.util.Optional;

import com.sistema.turnos.entities.Ticket;
import com.sistema.turnos.enums.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    Optional<Ticket> findFirstByStatusOrderByCreatedAtAsc(TicketStatus status);

    List<Ticket> findTop10ByStatusOrderByCalledAtDesc(TicketStatus status);

}