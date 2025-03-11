package me.dio.repository;

import me.dio.model.Autenticacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutenticacaoRepository extends JpaRepository<Autenticacao, Long> {
}