package me.dio.controller;

import me.dio.model.Autenticacao;
import me.dio.service.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autenticacao")
public class AutenticacaoController {

    @Autowired
    private AutenticacaoService autenticacaoService;

    @PostMapping
    public Autenticacao salvar(@RequestBody Autenticacao autenticacao) {
        return autenticacaoService.salvar(autenticacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autenticacao> buscarPorId(@PathVariable Long id) {
        return autenticacaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}