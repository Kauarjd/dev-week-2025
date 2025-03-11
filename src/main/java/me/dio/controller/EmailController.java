package me.dio.controller;

import me.dio.model.Email;
import me.dio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public List<Email> listarTodos() {
        return emailService.listarTodos();
    }

    @PostMapping
    public Email salvar(@RequestBody Email email) {
        return emailService.salvar(email);
    }
}