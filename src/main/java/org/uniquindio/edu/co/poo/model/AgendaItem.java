package org.uniquindio.edu.co.poo.model;

import java.time.LocalDateTime;

public record AgendaItem(
        LocalDateTime fecha,
        String descripcion
) {
}
