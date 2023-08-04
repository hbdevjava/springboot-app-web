package com.hbdev.eventoApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbdev.eventoApp.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
