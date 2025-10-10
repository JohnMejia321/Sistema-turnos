package com.sistema.turnos.dtos;

import com.sistema.turnos.enums.TicketStatus;

import java.time.Instant;

public record TicketResponseDTO(Long id, String code, TicketStatus status, Instant createdAt, Instant calledAt, Instant serveAt,
                                Integer moduleNumber, String fullName) {

}