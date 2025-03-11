package me.dio.service;

import me.dio.model.Autenticacao;
import me.dio.repository.AutenticacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService {

    @Autowired
    private AutenticacaoRepository autenticacaoRepository;

    public Autenticacao salvar(Autenticacao autenticacao) {
        return autenticacaoRepository.save(autenticacao);
    }

    public Optional<Autenticacao> buscarPorId(Long id) {
        return autenticacaoRepository.findById(id);
    }
}