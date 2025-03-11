package me.dio.service;

import me.dio.model.Email;
import me.dio.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public List<Email> listarTodos() {
        return emailRepository.findAll();
    }

    public Email salvar(Email email) {
        return emailRepository.save(email);
    }
}