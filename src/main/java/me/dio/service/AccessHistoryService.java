package me.dio.service;

import me.dio.model.AccessHistory;
import me.dio.repository.AccessHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessHistoryService {

    @Autowired
    private AccessHistoryRepository accessHistoryRepository;

    public List<AccessHistory> listarTodos() {
        return accessHistoryRepository.findAll();
    }

    public AccessHistory salvar(AccessHistory accessHistory) {
        return accessHistoryRepository.save(accessHistory);
    }
}