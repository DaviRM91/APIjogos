package com.example.api.jogos.repository;

import com.example.api.jogos.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosRepositorio extends JpaRepository<Jogos, String> {
}
